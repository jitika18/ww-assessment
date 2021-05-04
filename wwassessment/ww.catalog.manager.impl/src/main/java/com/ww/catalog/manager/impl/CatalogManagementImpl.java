package com.ww.catalog.manager.impl;

import java.util.Map;
import java.util.Set;

import com.ww.catalog.manager.CatalogManagement;
import com.ww.db.transactions.CatalogDataImpl;
import com.ww.model.object.CategoryType;
import com.ww.model.object.Product;

public class CatalogManagementImpl implements CatalogManagement{
	CatalogDataImpl data;
	
	CatalogManagementImpl(CatalogDataImpl data) {
		this.data = data;
	}

	@Override
	public String addProduct(Product product) {
		// Implementation not required per assessment
		return null;
	}

	@Override
	public String updateProduct(Product product) {
		// Implementation not required per assessment
		return null;
	}

	@Override
	public String deleteProduct(Product product) {
		// Implementation not required per assessment
		return null;
	}

	@Override
	public Set<Product> getProducts() {
		// Implementation not required per assessment
		return null;
	}

	@Override
	public Set<Product> getProductsByCategory(CategoryType categoryType) {
		Map<CategoryType, Set<Product>> products = data.getProducts();
		if (products != null) {
			return products.entrySet().stream()//
					.filter(p -> p.getKey().equals(categoryType))//
					.map(Map.Entry::getValue)//
					.findAny()//
					.get();//
		}
		return null;
	}

	@Override
	public int countProducts(Set<Product> product) {
		return product.size();
	}

}
