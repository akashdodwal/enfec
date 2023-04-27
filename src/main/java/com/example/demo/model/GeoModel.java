package com.example.demo.model;

import java.io.Serializable;

public class GeoModel implements Serializable {

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	private static final long serialVersionUID = 525985852064041032L;

	private Double lat;

	private Double lng;

}
