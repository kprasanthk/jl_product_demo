package com.jl.demo.dto;

import java.util.List;

public class ProductDTO {
	private String productId;
	private String title;
	private List<ColorSwatcheDTO> colorSwatches;
	private String nowPrice;
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
}
