package com.jl.demo.model;

import java.util.List;

public class Facet {

	private String dimensionName;
	private String name;
	private String type;
	private String tooltip;
	private List<FacetDetails> details;
	
	public String getDimensionName() {
		return dimensionName;
	}
	public void setDimensionName(String dimensionName) {
		this.dimensionName = dimensionName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTooltip() {
		return tooltip;
	}
	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}
	public List<FacetDetails> getDetails() {
		return details;
	}
	public void setDetails(List<FacetDetails> details) {
		this.details = details;
	}
}
