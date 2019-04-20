package com.jl.demo.model;

public class PriceNow {
	private String from;
	private String to;
	
	public PriceNow() {}
	public PriceNow(String to) {
		this.to=to;
	}
	public PriceNow(String from, String to) {
		this.from=from;
		this.to=to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
}
