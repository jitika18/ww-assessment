package com.ww.model.object;

public class Category {
	
	private long id;
	private CategoryType name;
	private boolean active;
	private boolean featured;
	private boolean navigationIncluded;
	private String url;
	private String urlKey;
	private Category parentCategory; //null if parent
	
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
	 * @return the name
	 */
	public CategoryType getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(CategoryType name) {
		this.name = name;
	}
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	/**
	 * @return the featured
	 */
	public boolean isFeatured() {
		return featured;
	}
	/**
	 * @param featured the featured to set
	 */
	public void setFeatured(boolean featured) {
		this.featured = featured;
	}
	/**
	 * @return the navigationIncluded
	 */
	public boolean isNavigationIncluded() {
		return navigationIncluded;
	}
	/**
	 * @param navigationIncluded the navigationIncluded to set
	 */
	public void setNavigationIncluded(boolean navigationIncluded) {
		this.navigationIncluded = navigationIncluded;
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
	 * @return the urlKey
	 */
	public String getUrlKey() {
		return urlKey;
	}
	/**
	 * @param urlKey the urlKey to set
	 */
	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}
	/**
	 * @return the parentCategory
	 */
	public Category getParentCategory() {
		return parentCategory;
	}
	/**
	 * @param parentCategory the parentCategory to set
	 */
	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}
	

}
