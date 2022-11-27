package com.lti.gladiator.services;

import com.lti.gladiator.beans.Category;

public interface CategoryService {
	public boolean addCategorie(Category e);
	public Category search(int eid);
	public Category modifyCategorie(Category e);
	public boolean removeCatogorie(Category e);
}
