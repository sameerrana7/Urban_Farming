package com.lti.gladiator.services;

import com.lti.gladiator.beans.categorie;

public interface categorieService {
	public boolean addCategorie(categorie e);
	public categorie search(int eid);
	public categorie modifyCategorie(categorie e);
	public boolean removeCatogorie(categorie e);
}
