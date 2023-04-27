package com.example.demo.model;

import java.io.Serializable;

public class CompanyModel implements Serializable {

	private static final long serialVersionUID = 6879126612965868087L;

	private String name;

	private String catchPhrase;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

	private String bs;

}
