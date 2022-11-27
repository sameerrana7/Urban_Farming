package com.lti.gladiator.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class categorie {
	@Id
	@Column(name = "")
	private int categorieId;
	@Column(name = "")
	private String categorieName;

	public int getCategorieId() {
		return categorieId;
	}

	public void setCategorieId(int categorieId) {
		this.categorieId = categorieId;
	}

	public String getCategorieName() {
		return categorieName;
	}

	public void setCategorieName(String categorieName) {
		this.categorieName = categorieName;
	}

	@Override
	public String toString() {
		return "Categories [categorieId=" + categorieId + ", categorieName=" + categorieName + "]";
	}

	public categorie(int categorieId, String categorieName) {
		super();
		this.categorieId = categorieId;
		this.categorieName = categorieName;
	}

	public categorie() {
		super();
	}

}
