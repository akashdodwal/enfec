package com.example.demo.model;

import java.io.Serializable;

public class PostModel implements Serializable {

	public PostModel() {
	}

	private static final long serialVersionUID = -5996630809689525445L;

	private Long userId;

	private Long id;

	private String title;

	private String body;

	public PostModel(Long userId, Long id, String title, String body) {
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.body = body;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

}
