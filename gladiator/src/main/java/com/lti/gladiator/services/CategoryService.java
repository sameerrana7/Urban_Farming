package com.lti.gladiator.services;

import java.util.List;

import com.lti.gladiator.beans.Category;
import com.lti.gladiator.beans.Product;

public interface CategoryService {
	public boolean addCategorie(Category e);

	public Category search(int eid);

	public Category modifyCategorie(Category e);

	public boolean removeCatogorie(Category e);

	public List<Product> getProductByCat(int categoryId);

	public List<Category> getCategory();
}
