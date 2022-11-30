package com.lti.gladiator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.gladiator.beans.Category;
import com.lti.gladiator.beans.Product;
import com.lti.gladiator.services.CategoryServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	CategoryServiceImpl categoryService;

//	@PostMapping("/addCategory")
	public boolean addCategorie(Category e) {
		// TODO Auto-generated method stub
		if (categoryService.addCategorie(e)) {
			return true;
		} else {
			return false;
		}
	}

//	@GetMapping
	public Category search(int eid) {
		Category e2 = categoryService.search(eid);
		return e2;
	}

//	@GetMapping
	public Category modifyCategorie(Category e) {
		Category e3 = categoryService.modifyCategorie(e);
		return e3;
	}

//	@GetMapping
	public boolean removeCatogorie(Category e) {
		if (categoryService.removeCatogorie(e)) {
			return true;
		} else {
			return false;
		}
	}

	// http://localhost:8282/category/ProdByCategory
	@GetMapping("/ProdByCategory/{categoryId}")
	public List<Product> getProductByCat(@PathVariable("categoryId") int categoryId) {
		// TODO Auto-generated method stub
		List<Product> l1 = categoryService.getProductByCat(categoryId);
		return l1;
	}

	// http://localhost:8282/category/Category
	@GetMapping("/Category")
	public List<Category> getCategory() {
		return categoryService.getCategory();
	}
}
