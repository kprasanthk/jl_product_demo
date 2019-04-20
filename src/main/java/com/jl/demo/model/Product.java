package com.jl.demo.model;

import java.util.List;

public class Product {
	private String productId;
	private String type;
	private String title;
	private String code;
	private float averageRating;
	private int reviews;
	private Price price;
	private String image;
	private List<String> additionalServices;
	private String displaySpecialOffer;
	private PromoMessages promoMessages;
	private String nonPromoMessage;
	private String defaultSkuId;
	private List<ColorSwatch> colorSwatches;
	private int colorSwatchSelected;
	private String colorWheelMessage;
	private boolean outOfStock;
	private boolean emailMeWhenAvailable;
	private String availabilityMessage;
	private boolean compare;
	private String fabric;
	private boolean swatchAvailable;
	private boolean categoryQuickViewEnabled;
	private String swatchCategoryType;
	private String brand;
	private int ageRestriction;
	private boolean isInStoreOnly;
	private boolean isMadeToMeasure;
	private boolean isBundle;
	private boolean isProductSet;
	private List<PromotionalFeature> promotionalFeatures;
	private List<String> features;
	private QuickAddToBasket quickAddToBasket;
	private DynamicAttributes dynamicAttributes;
	private String directorate;
	private long releaseDateTimestamp;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public float getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}
	public int getReviews() {
		return reviews;
	}
	public void setReviews(int reviews) {
		this.reviews = reviews;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public List<String> getAdditionalServices() {
		return additionalServices;
	}
	public void setAdditionalServices(List<String> additionalServices) {
		this.additionalServices = additionalServices;
	}
	public String getDisplaySpecialOffer() {
		return displaySpecialOffer;
	}
	public void setDisplaySpecialOffer(String displaySpecialOffer) {
		this.displaySpecialOffer = displaySpecialOffer;
	}
	public PromoMessages getPromoMessages() {
		return promoMessages;
	}
	public void setPromoMessages(PromoMessages promoMessages) {
		this.promoMessages = promoMessages;
	}
	public String getNonPromoMessage() {
		return nonPromoMessage;
	}
	public void setNonPromoMessage(String nonPromoMessage) {
		this.nonPromoMessage = nonPromoMessage;
	}
	public String getDefaultSkuId() {
		return defaultSkuId;
	}
	public void setDefaultSkuId(String defaultSkuId) {
		this.defaultSkuId = defaultSkuId;
	}
	public List<ColorSwatch> getColorSwatches() {
		return colorSwatches;
	}
	public void setColorSwatches(List<ColorSwatch> colorSwatches) {
		this.colorSwatches = colorSwatches;
	}
	public int getColorSwatchSelected() {
		return colorSwatchSelected;
	}
	public void setColorSwatchSelected(int colorSwatchSelected) {
		this.colorSwatchSelected = colorSwatchSelected;
	}
	public String getColorWheelMessage() {
		return colorWheelMessage;
	}
	public void setColorWheelMessage(String colorWheelMessage) {
		this.colorWheelMessage = colorWheelMessage;
	}
	public boolean isOutOfStock() {
		return outOfStock;
	}
	public void setOutOfStock(boolean outOfStock) {
		this.outOfStock = outOfStock;
	}
	public boolean isEmailMeWhenAvailable() {
		return emailMeWhenAvailable;
	}
	public void setEmailMeWhenAvailable(boolean emailMeWhenAvailable) {
		this.emailMeWhenAvailable = emailMeWhenAvailable;
	}
	public String getAvailabilityMessage() {
		return availabilityMessage;
	}
	public void setAvailabilityMessage(String availabilityMessage) {
		this.availabilityMessage = availabilityMessage;
	}
	public boolean isCompare() {
		return compare;
	}
	public void setCompare(boolean compare) {
		this.compare = compare;
	}
	public String getFabric() {
		return fabric;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	public boolean isSwatchAvailable() {
		return swatchAvailable;
	}
	public void setSwatchAvailable(boolean swatchAvailable) {
		this.swatchAvailable = swatchAvailable;
	}
	public boolean isCategoryQuickViewEnabled() {
		return categoryQuickViewEnabled;
	}
	public void setCategoryQuickViewEnabled(boolean categoryQuickViewEnabled) {
		this.categoryQuickViewEnabled = categoryQuickViewEnabled;
	}
	public String getSwatchCategoryType() {
		return swatchCategoryType;
	}
	public void setSwatchCategoryType(String swatchCategoryType) {
		this.swatchCategoryType = swatchCategoryType;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getAgeRestriction() {
		return ageRestriction;
	}
	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}
	public boolean isInStoreOnly() {
		return isInStoreOnly;
	}
	public void setInStoreOnly(boolean isInStoreOnly) {
		this.isInStoreOnly = isInStoreOnly;
	}
	public boolean isMadeToMeasure() {
		return isMadeToMeasure;
	}
	public void setMadeToMeasure(boolean isMadeToMeasure) {
		this.isMadeToMeasure = isMadeToMeasure;
	}
	public boolean isBundle() {
		return isBundle;
	}
	public void setBundle(boolean isBundle) {
		this.isBundle = isBundle;
	}
	public boolean isProductSet() {
		return isProductSet;
	}
	public void setProductSet(boolean isProductSet) {
		this.isProductSet = isProductSet;
	}
	public List<PromotionalFeature> getPromotionalFeatures() {
		return promotionalFeatures;
	}
	public void setPromotionalFeatures(List<PromotionalFeature> promotionalFeatures) {
		this.promotionalFeatures = promotionalFeatures;
	}
	public List<String> getFeatures() {
		return features;
	}
	public void setFeatures(List<String> features) {
		this.features = features;
	}
	public QuickAddToBasket getQuickAddToBasket() {
		return quickAddToBasket;
	}
	public void setQuickAddToBasket(QuickAddToBasket quickAddToBasket) {
		this.quickAddToBasket = quickAddToBasket;
	}
	public DynamicAttributes getDynamicAttributes() {
		return dynamicAttributes;
	}
	public void setDynamicAttributes(DynamicAttributes dynamicAttributes) {
		this.dynamicAttributes = dynamicAttributes;
	}
	public String getDirectorate() {
		return directorate;
	}
	public void setDirectorate(String directorate) {
		this.directorate = directorate;
	}
	public long getReleaseDateTimestamp() {
		return releaseDateTimestamp;
	}
	public void setReleaseDateTimestamp(long releaseDateTimestamp) {
		this.releaseDateTimestamp = releaseDateTimestamp;
	}
	
}
