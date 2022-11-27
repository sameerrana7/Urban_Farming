package com.lti.gladiator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.gladiator.beans.categorie;
import com.lti.gladiator.dao.categorieDao;

@Service("categorieService")
public class categorieServiceImpl implements categorieService {
	@Autowired
	categorieDao dao;
	
	@Override
	public boolean addCategorie(categorie e) {
		// TODO Auto-generated method stub
		if (dao.createCategorie(e)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public categorie search(int eid) {
		categorie e2 = dao.findCategorieById(eid);
		return e2;
	}

	@Override
	public categorie modifyCategorie(categorie e) {
		categorie e3 = dao.updateCategorie(e);
		return e3;
	}

	@Override
	public boolean removeCatogorie(categorie e) {
		if (dao.deleteCategorie(e)) {
			return true;
		} else {
			return false;
		}
	}

}
