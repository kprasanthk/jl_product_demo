package com.jl.demo.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Price {

	private String was;
	private String then1;
	private String then2;
	
	@JsonIgnore
	private PriceNow now;
	private String uom;
	private String currency;
	
	public String getWas() {
		return was;
	}
	public void setWas(String was) {
		this.was = was;
	}
	public String getThen1() {
		return then1;
	}
	public void setThen1(String then1) {
		this.then1 = then1;
	}
	public String getThen2() {
		return then2;
	}
	public void setThen2(String then2) {
		this.then2 = then2;
	}
	public PriceNow getNow() {
		return now;
	}
	public void setNow(PriceNow now) {
		this.now = now;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	@JsonAnySetter
	public void setPriceNow(String name, Object value) {
		if (value instanceof String) {
            now = new PriceNow((String)value);
        }
		if (value instanceof Map) {
			now = new PriceNow(((Map<String, String>)value).get("from"), ((Map<String, String>)value).get("to"));
		}
	}
}
