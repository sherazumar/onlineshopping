
package com.onlineshopping.controller;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.onlineshopping.model.Role;
import com.onlineshopping.model.User;
import com.onlineshopping.repository.RoleRepository;
import com.onlineshopping.repository.UserRepository;


@Controller
public class LoginController {


	//private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/register")
	public String registerGet() {
		return "register";
	}
	
	@PostMapping("/register")
	public String registerPost(@ModelAttribute("user") User user) {
		String password = user.getPassword();
		user.setPassword(password);
		Set<Role> roles = new HashSet<>();
		Role role = roleRepository.findById(1).get();
		System.out.println(role.getName());
		roles.add(role);
		user.setRole(roles) ;
		User newUser = new User(user.getFirstName(), user.getLastName(), user.getEmail(), password);
		newUser.setRole(roles);
		userRepository.save(newUser);
		//request.login(user.getEmail(), password);
		return "redirect:/login";	
	}

	@PostMapping("/login")
	public String loginPost(@RequestParam(name = "redirect", required=false) String redirect, @ModelAttribute("user") User user, Model model, HttpServletResponse response) {
		String email = user.getEmail();
		Optional<User> existingUser = userRepository.findUserByEmail(email);

		if (existingUser.isEmpty()) {
			model.addAttribute("error", "Invalid credentials");
			return "login";
		}
		
		boolean matched = false;
		
		if (existingUser.get().getPassword().compareTo(user.getPassword()) == 0) {
			matched = true;
		}

		if (matched == false) {
			model.addAttribute("error", "Invalid credentials");
			return "login";
		}

		Cookie cookie = new Cookie("user",email);
		cookie.setSecure(false);
	    cookie.setHttpOnly(false);
		response.addCookie(cookie);
		
		return "redirect:/shop";
	}
	
	@PostMapping("/payNow")
	public String payNow() {
		return "orderPlaced";
	}
}
