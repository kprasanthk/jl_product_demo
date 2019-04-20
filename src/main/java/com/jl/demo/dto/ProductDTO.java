package com.jl.demo.dto;

import java.util.Comparator;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ProductDTO {
	private String productId;
	private String title;
	private List<ColorSwatcheDTO> colorSwatches;
	private String nowPrice;
	@JsonIgnore
	private Float price;
	private String priceLabel;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<ColorSwatcheDTO> getColorSwatches() {
		return colorSwatches;
	}
	public void setColorSwatches(List<ColorSwatcheDTO> colorSwatches) {
		this.colorSwatches = colorSwatches;
	}
	public String getNowPrice() {
		return nowPrice;
	}
	public void setNowPrice(String nowPrice) {
		this.nowPrice = nowPrice;
	}
	public String getPriceLabel() {
		return priceLabel;
	}
	public void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	public static Comparator<ProductDTO> priceComparator = new Comparator<ProductDTO>() {         
	    @Override         
	    public int compare(ProductDTO jc1, ProductDTO jc2) {             
	      return (jc2.getPrice() < jc1.getPrice() ? -1 :                     
	              (jc2.getPrice() == jc1.getPrice() ? 0 : 1));           
	    }     
	  };
}
