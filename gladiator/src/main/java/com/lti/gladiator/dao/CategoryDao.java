package com.lti.gladiator.dao;

import com.lti.gladiator.beans.Category;

public interface CategoryDao {
	public boolean createCategorie(Category e);
	public Category findCategorieById(int userid);
	public Category updateCategorie(Category e);
	public boolean deleteCategorie(Category e);
}
