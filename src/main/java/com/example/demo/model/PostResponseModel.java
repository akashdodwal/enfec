package com.example.demo.model;

import java.io.Serializable;

public class PostResponseModel implements Serializable {
	
	private static final long serialVersionUID = -8773204515783752865L;

	private Long id;
	
	private String title;
	
	private String body;
	
	private GeoModel geo;
	
	private String companyName;
	
	public PostResponseModel(Long id, String title, String body, GeoModel geo, String companyName) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.geo = geo;
		this.companyName = companyName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public GeoModel getGeo() {
		return geo;
	}

	public void setGeo(GeoModel geo) {
		this.geo = geo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
