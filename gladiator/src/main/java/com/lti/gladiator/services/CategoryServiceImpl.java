package com.lti.gladiator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.gladiator.beans.Category;
import com.lti.gladiator.dao.CategoryDao;

@Service("categorieService")
public class CategoryServiceImpl implements CategoryService {
//	@Autowired
	CategoryDao dao;
	
	@Override
	public boolean addCategorie(Category e) {
		// TODO Auto-generated method stub
		if (dao.createCategorie(e)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Category search(int eid) {
		Category e2 = dao.findCategorieById(eid);
		return e2;
	}

	@Override
	public Category modifyCategorie(Category e) {
		Category e3 = dao.updateCategorie(e);
		return e3;
	}

	@Override
	public boolean removeCatogorie(Category e) {
		if (dao.deleteCategorie(e)) {
			return true;
		} else {
			return false;
		}
	}

}
