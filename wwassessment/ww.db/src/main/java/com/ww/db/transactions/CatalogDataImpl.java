package com.ww.db.transactions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.ww.model.object.CategoryType;
import com.ww.model.object.Product;

/**
 * To be implemented with actual db, this is not the final version. Mocking data to be used for assessment
 * @author jitika.bharaj
 *
 */
public class CatalogDataImpl implements CatalogData{

	@Override
	public void addProduct(Product product) throws Exception {
		// Mock implementation not required per assessment
		
	}

	@Override
	public void updateProduct(Product product) throws Exception {
		// Mock implementation not required per assessment
		
	}

	@Override
	public void deleteProduct(Product product) throws Exception {
		// Mock implementation not required per assessment
		
	}

	@Override
	public Set<Product> getAllProducts() {
		// Mock implementation not required per assessment
		return null;
	}

	@Override
	public Map<CategoryType, Set<Product>> getProducts() {
		// Mock data to be used for assessment

		Map<CategoryType, Set<Product>> products = new HashMap<CategoryType, Set<Product>>();
		//DB Implementation out of scope
		
		return products;
	}

}
