package com.operation.newspaper;

import java.sql.Date;

public class Newspaper {
	
	private int id;
	private String newspaperName;
	private String name;
	private String organizationName;
	private String phone;
	private String email;
	private Date publishDate;
	private String adTitle;
	private String adDescription;
	private String document;
	private String publishStatus;
	
	public Newspaper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Newspaper(int id, String newspaperName, String name, String organizationName, String phone, String email,
			Date publishDate, String adTitle, String adDescription, String document, String publishStatus) {
		super();
		this.id = id;
		this.newspaperName = newspaperName;
		this.name = name;
		this.organizationName = organizationName;
		this.phone = phone;
		this.email = email;
		this.publishDate = publishDate;
		this.adTitle = adTitle;
		this.adDescription = adDescription;
		this.document = document;
		this.publishStatus = publishStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNewspaperName() {
		return newspaperName;
	}

	public void setNewspaperName(String newspaperName) {
		this.newspaperName = newspaperName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getAdTitle() {
		return adTitle;
	}

	public void setAdTitle(String adTitle) {
		this.adTitle = adTitle;
	}

	public String getAdDescription() {
		return adDescription;
	}

	public void setAdDescription(String adDescription) {
		this.adDescription = adDescription;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getPublishStatus() {
		return publishStatus;
	}

	public void setPublishStatus(String publishStatus) {
		this.publishStatus = publishStatus;
	}
	
	
	
	
}
