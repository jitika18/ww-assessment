package com.ww.model.object;

import java.util.Date;

public class Sku {
	
	private long id;
	private String name;
	private String description;
	private String shortDescription;
	private Date startDate;
	private long retailPrice;
	private long salePrice;
	private String basePriceUnit;
	private long discount;
	private boolean active;
	private boolean available;
	private boolean isNew;
	private InventoryType inventoryType;
	private long wwSku;
	private ProductType productType;
	private int quantity;
	private boolean subscription;
	private String taxCode;
	private FullfillmentType fullfillmentType;
	
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
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}
	/**
	 * @param shortDescription the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the retailPrice
	 */
	public long getRetailPrice() {
		return retailPrice;
	}
	/**
	 * @param retailPrice the retailPrice to set
	 */
	public void setRetailPrice(long retailPrice) {
		this.retailPrice = retailPrice;
	}
	/**
	 * @return the salePrice
	 */
	public long getSalePrice() {
		return salePrice;
	}
	/**
	 * @param salePrice the salePrice to set
	 */
	public void setSalePrice(long salePrice) {
		this.salePrice = salePrice;
	}
	/**
	 * @return the basePriceUnit
	 */
	public String getBasePriceUnit() {
		return basePriceUnit;
	}
	/**
	 * @param basePriceUnit the basePriceUnit to set
	 */
	public void setBasePriceUnit(String basePriceUnit) {
		this.basePriceUnit = basePriceUnit;
	}
	/**
	 * @return the discount
	 */
	public long getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(long discount) {
		this.discount = discount;
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
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	/**
	 * @return the inventoryType
	 */
	public InventoryType getInventoryType() {
		return inventoryType;
	}
	/**
	 * @return the isNew
	 */
	public boolean isNew() {
		return isNew;
	}
	/**
	 * @param isNew the isNew to set
	 */
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	/**
	 * @param inventoryType the inventoryType to set
	 */
	public void setInventoryType(InventoryType inventoryType) {
		this.inventoryType = inventoryType;
	}
	/**
	 * @return the wwSku
	 */
	public long getWwSku() {
		return wwSku;
	}
	/**
	 * @param wwSku the wwSku to set
	 */
	public void setWwSku(long wwSku) {
		this.wwSku = wwSku;
	}
	/**
	 * @return the productType
	 */
	public ProductType getProductType() {
		return productType;
	}
	/**
	 * @param productType the productType to set
	 */
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the subscription
	 */
	public boolean isSubscription() {
		return subscription;
	}
	/**
	 * @param subscription the subscription to set
	 */
	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}
	/**
	 * @return the taxCode
	 */
	public String getTaxCode() {
		return taxCode;
	}
	/**
	 * @param taxCode the taxCode to set
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	/**
	 * @return the fullfillmentType
	 */
	public FullfillmentType getFullfillmentType() {
		return fullfillmentType;
	}
	/**
	 * @param fullfillmentType the fullfillmentType to set
	 */
	public void setFullfillmentType(FullfillmentType fullfillmentType) {
		this.fullfillmentType = fullfillmentType;
	}
	
		
	
}
