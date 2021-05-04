package com.ww.model.object;

import java.util.Set;

public class Product {
	
	private long id;
	private String productName;
	private String description;
	private String url;
	private Currency currency;
	private Category category;
	private Set<Media> medias;
	private Set<Sku> skus;
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the currency
	 */
	public Currency getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	/**
	 * @return the medias
	 */
	public Set<Media> getMedias() {
		return medias;
	}
	/**
	 * @param medias the medias to set
	 */
	public void setMedias(Set<Media> medias) {
		this.medias = medias;
	}
	/**
	 * @return the skus
	 */
	public Set<Sku> getSkus() {
		return skus;
	}
	/**
	 * @param skus the skus to set
	 */
	public void setSkus(Set<Sku> skus) {
		this.skus = skus;
	}
	
	
}
