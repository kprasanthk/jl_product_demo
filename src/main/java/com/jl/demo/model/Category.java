package com.jl.demo.model;

import java.util.List;

public class Category {

	private List<Product> products;
	private List<Facet> facets;
	private String categoryTitle;
	private int childCategoriesCount;
	private SEOInformation seoInformation;
	private int results;
	private int pagesAvailable;
	private List<Crumb> crumbs;
	private String dynamicBannerId;
	private String seoBannerId;
	private TriggeredRules triggeredRules;
	private String redirectUrl;
	private List<String> staticLinks;
	private String selectedDept;
	private String multiCatSelected;
	private String endecaCanonical;
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Facet> getFacets() {
		return facets;
	}
	public void setFacets(List<Facet> facets) {
		this.facets = facets;
	}
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	public int getChildCategoriesCount() {
		return childCategoriesCount;
	}
	public void setChildCategoriesCount(int childCategoriesCount) {
		this.childCategoriesCount = childCategoriesCount;
	}
	public SEOInformation getSeoInformation() {
		return seoInformation;
	}
	public void setSeoInformation(SEOInformation seoInformation) {
		this.seoInformation = seoInformation;
	}
	public int getResults() {
		return results;
	}
	public void setResults(int results) {
		this.results = results;
	}
	public int getPagesAvailable() {
		return pagesAvailable;
	}
	public void setPagesAvailable(int pagesAvailable) {
		this.pagesAvailable = pagesAvailable;
	}
	public List<Crumb> getCrumbs() {
		return crumbs;
	}
	public void setCrumbs(List<Crumb> crumbs) {
		this.crumbs = crumbs;
	}
	public String getDynamicBannerId() {
		return dynamicBannerId;
	}
	public void setDynamicBannerId(String dynamicBannerId) {
		this.dynamicBannerId = dynamicBannerId;
	}
	public String getSeoBannerId() {
		return seoBannerId;
	}
	public void setSeoBannerId(String seoBannerId) {
		this.seoBannerId = seoBannerId;
	}
	public TriggeredRules getTriggeredRules() {
		return triggeredRules;
	}
	public void setTriggeredRules(TriggeredRules triggeredRules) {
		this.triggeredRules = triggeredRules;
	}
	public String getRedirectUrl() {
		return redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public List<String> getStaticLinks() {
		return staticLinks;
	}
	public void setStaticLinks(List<String> staticLinks) {
		this.staticLinks = staticLinks;
	}
	public String getSelectedDept() {
		return selectedDept;
	}
	public void setSelectedDept(String selectedDept) {
		this.selectedDept = selectedDept;
	}
	public String getMultiCatSelected() {
		return multiCatSelected;
	}
	public void setMultiCatSelected(String multiCatSelected) {
		this.multiCatSelected = multiCatSelected;
	}
	public String getEndecaCanonical() {
		return endecaCanonical;
	}
	public void setEndecaCanonical(String endecaCanonical) {
		this.endecaCanonical = endecaCanonical;
	}
}
