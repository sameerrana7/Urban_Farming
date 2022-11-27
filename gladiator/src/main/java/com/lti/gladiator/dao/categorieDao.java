package com.lti.gladiator.dao;

import com.lti.gladiator.beans.categorie;

public interface categorieDao {
	public boolean createCategorie(categorie e);
	public categorie findCategorieById(int userid);
	public categorie updateCategorie(categorie e);
	public boolean deleteCategorie(categorie e);
}
