package com.ww.db.transactions;

import java.util.Map;
import java.util.Set;

import com.ww.model.object.CategoryType;
import com.ww.model.object.Product;

public interface CatalogData {
	
	/**
	 * Adds product to DB
	 * @param product The {@link com.ww.model.object.Product} to add
	 * @throws Exception if transaction is unsuccessful
	 */
	public void addProduct(Product product) throws Exception;
	
	/**
	 * Updates product in DB
	 * @param product The {@link com.ww.model.object.Product} to update
	 * @throws Exception if transaction is unsuccessful
	 */
	public void updateProduct(Product product) throws Exception;
	
	/**
	 * Deletes product in DB
	 * @param product The {@link com.ww.model.object.Product} to delete
	 * @throws Exception if transaction is unsuccessful
	 */
	public void deleteProduct(Product product) throws Exception;
	
	/**
	 * Gets all the {@link com.ww.model.object.Product}
	 * @return a {@link java.util.Set} of {@link com.ww.model.object.Product}
	 */
	public Set<Product> getAllProducts();
	
	/**
	 * Gets all the {@link com.ww.model.object.Product} sorted by CategoryType
	 * @return a {@link java.util.Map} of {@link com.ww.model.object.CategoryType}, {@link java.util.Set} of {@link com.ww.model.object.Product}
	 */
	public Map<CategoryType, Set<Product>> getProducts();

}
