package com.lti.gladiator.dao;

import java.util.List;

import com.lti.gladiator.beans.Category;
import com.lti.gladiator.beans.Product;

public interface CategoryDao {
	public boolean createCategorie(Category e);
	public Category findCategorieById(int userid);
	public Category updateCategorie(Category e);
	public boolean deleteCategorie(Category e);
	public List<Product> getProductByCat(int categoryId);
	public List<Category> getCategory();
}
