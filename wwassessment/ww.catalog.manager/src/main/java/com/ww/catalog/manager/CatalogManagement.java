package com.ww.catalog.manager;

import java.util.Set;

import com.ww.model.object.CategoryType;
import com.ww.model.object.Product;

public interface CatalogManagement {
	
	/**
	 * Returns a message if the product has been added successfully or not
	 * @param product The {@link com.ww.model.object.Product} to add
	 * @return a success message if product added, failure message otherwise
	 */
	String addProduct(Product product);
	
	/**
	 * Returns a message if the product has been updated successfully or not
	 * @param product The {@link com.ww.model.object.Product} to be updated
	 * @return a success message if product is updated, failure message otherwise
	 */
	String updateProduct(Product product);
	
	/**
	 * Returns a message if the product has been deleted successfully or not
	 * @param product The {@link com.ww.model.object.Product} to delete
	 * @return a success message if product is deleted, failure message otherwise
	 */
	String deleteProduct(Product product);
	
	/**
	 * Gets all the {@link com.ww.model.object.Product}
	 * @return a {@link java.util.Set} of {@link com.ww.model.object.Product}
	 */
	Set<Product> getProducts();
	
	/**
	 * Gets all the {@link com.ww.model.object.Product} for a given {@link com.ww.model.object.CategortType}
	 * @param categoryType The {@link com.ww.model.object.CategortType} to filter by
	 * @return a {@link java.util.Set} of {@link com.ww.model.object.Product}
	 */
	Set<Product> getProductsByCategory(CategoryType categoryType);
	
	/**
	 * Returns number of {@link com.ww.model.object.Product}
	 * @param product {@link com.ww.model.object.Product} to count
	 * @return the number of {@link com.ww.model.object.Product}
	 */
	int countProducts(Set<Product> product);

}
