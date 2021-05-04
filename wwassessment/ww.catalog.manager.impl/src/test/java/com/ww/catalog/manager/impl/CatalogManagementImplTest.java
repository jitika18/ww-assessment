package com.ww.catalog.manager.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.ww.db.transactions.CatalogDataImpl;
import com.ww.model.object.Category;
import com.ww.model.object.CategoryType;
import com.ww.model.object.Product;

public class CatalogManagementImplTest {
	
	
	Map<CategoryType, Set<Product>> products;
	
	@Before
	public void setup() {
		
		Category parentCategory = new Category();
		parentCategory.setId(1L);
		parentCategory.setName(CategoryType.KITCHEN);
		Category cat = new Category();
		cat.setId(2L);
		cat.setName(CategoryType.DRINKWARE);
		cat.setParentCategory(parentCategory);
		Product p = new Product();
		p.setId(1L);
		p.setCategory(cat);
		p.setProductName("WW by BUILT(r) 30 oz Tumbler");
		p.setDescription("WW by BUILT(r) 30 oz Tumbler 5052013P");
		//other data values can be added
		
		products = new HashMap<CategoryType, Set<Product>>();
		CategoryType catType = p.getCategory().getParentCategory() == null? p.getCategory().getName() : p.getCategory().getParentCategory().getName();
		Set<Product> prod = new HashSet<Product>();
		prod.add(p);
		
		cat = new Category();
		cat.setId(3L);
		cat.setName(CategoryType.COOK_BOOKS);
		cat.setParentCategory(parentCategory);
		p = new Product();
		p.setId(2L);
		p.setCategory(cat);
		p.setProductName("The myWWTM Program Cookbook");
		p.setDescription("5061017P The myWW Program Cookbook");
		
		prod.add(p);
		
		catType = p.getCategory().getParentCategory() == null? p.getCategory().getName() : p.getCategory().getParentCategory().getName();
		products.put(catType, prod);
		
		parentCategory = new Category();
		parentCategory.setId(4L);
		parentCategory.setName(CategoryType.LIFESTYLE);
		cat = new Category();
		cat.setId(5L);
		cat.setName(CategoryType.BOOKS_AND_DINING_GUIDES);
		cat.setParentCategory(parentCategory);
		p = new Product();
		p.setId(3L);
		p.setCategory(cat);
		p.setProductName("52-Week Meal Planner");
		p.setDescription("52-Week Meal Planner 5061033P");
		//other data values can be added
		prod = new HashSet<Product>();
		prod.add(p);
		
		catType = p.getCategory().getParentCategory() == null? p.getCategory().getName() : p.getCategory().getParentCategory().getName();
		products.put(catType, prod);

	}
	
	@Test
	public void testGetProductsByCategory() {
		CatalogDataImpl data = Mockito.mock(CatalogDataImpl.class);
		assertNotNull(data);
		when(data.getProducts()).thenReturn(products);
		CategoryType testCategory = CategoryType.KITCHEN;
		CatalogManagementImpl impl = new CatalogManagementImpl(data);
		Set<Product> products = impl.getProductsByCategory(testCategory);
		
		assertEquals(2, products.size());
		
	}

}
