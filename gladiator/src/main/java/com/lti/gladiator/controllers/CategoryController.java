package com.lti.gladiator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.lti.gladiator.beans.Category;
import com.lti.gladiator.services.CategoryServiceImpl;

public class CategoryController {
	@Autowired
	CategoryServiceImpl categoryService;

	@PostMapping("/addCategory")
	public boolean addCategorie(Category e) {
		// TODO Auto-generated method stub
		if (categoryService.addCategorie(e)) {
			return true;
		} else {
			return false;
		}
	}

	@GetMapping
	public Category search(int eid) {
		Category e2 = categoryService.search(eid);
		return e2;
	}

	@GetMapping
	public Category modifyCategorie(Category e) {
		Category e3 = categoryService.modifyCategorie(e);
		return e3;
	}

	@GetMapping
	public boolean removeCatogorie(Category e) {
		if (categoryService.removeCatogorie(e)) {
			return true;
		} else {
			return false;
		}
	}
}
