package com.onlineshopping;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.onlineshopping.model.Category;
import com.onlineshopping.repository.CategoryRepository;
import com.onlineshopping.service.CategoryService;

@SpringBootTest
class onlineshoppingApplicationTests {

	@Autowired
	private CategoryService categoryService;
	
	@MockBean
	private CategoryRepository categoryRepository;
	
	@Test
	public void createCategoryTest() {
		Category category = new Category("Alpines");
		when(categoryRepository.save(category)).thenReturn(category);
		assertEquals(category, this.categoryService.addCategory(category));
	}
	
	@Test
	public void createCategoryFailTest() {
		Category category = new Category("Alpines");
		Category category2 = new Category("Alpines!!!");
		when(categoryRepository.save(category)).thenReturn(category);
		assertNotEquals(category2, this.categoryService.addCategory(category));
	}

}
