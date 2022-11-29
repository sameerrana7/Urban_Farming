package com.lti.gladiator.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.gladiator.beans.Category;
import com.lti.gladiator.beans.Product;

@Repository
public class CategoryDaoImpl implements CategoryDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public boolean createCategorie(Category e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Category findCategorieById(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category updateCategorie(Category e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCategorie(Category e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getProductByCat(int categoryId) {
		//"SELECT o FROM Order o JOIN o.user u WHERE u.userId=:userId"
		TypedQuery qry=em.createQuery("SELECT p FROM Product p JOIN p.category c WHERE c.categoryId=:categoryId",Product.class);
		qry.setParameter("categoryId", categoryId);
		List<Product> empList = qry.getResultList();
		if(empList.isEmpty())
		{
			System.out.println("XXXXXXXXXX No record Found XXXXXXXXXX");
		}
		return empList;
	}

	@Override
	public List<Category> getCategory() {
		TypedQuery qry=em.createQuery("SELECT c FROM Category c ",Category.class);
		List<Category> empList = qry.getResultList();
		if(empList.isEmpty())
		{
			System.out.println("XXXXXXXXXX No record Found XXXXXXXXXX");
		}
		return empList;
	}

}
