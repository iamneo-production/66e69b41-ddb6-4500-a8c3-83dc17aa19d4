package com.iamneo.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="product")
@Entity
public class VendorEntity {
	@Id
	@GeneratedValue()
	private int id;
	private String title;
	private String author;
	private int price;
	public int getId() {
	return id;
	}

	public void setId(int id) {
	this.id=id;
	}
	public String getTitle() {
	return title;
	}

	public void setTitle(String title) {
	this.title = title;
	}

	public String getAuthor() {
	return author;
	}

	public void setAuthor(String author) {
	this.author = author;
	}

	public int getPrice() {
	return price;
	}

	public void setPrice(int price) {
	this.price = price;
	}

	public VendorEntity(int id, String title, String author, int price) {
	super();
	this.id=id;
	this.title = title;
	this.author = author;
	this.price = price;
	}
	public VendorEntity() {

	}


}
