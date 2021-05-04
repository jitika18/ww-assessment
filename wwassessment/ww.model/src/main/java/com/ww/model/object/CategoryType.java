package com.ww.model.object;

public enum CategoryType {

	KITCHEN (true), //
	LIFESTYLE (true), //
	FOOD (true), //
	DRINKWARE (false), //
	SMALL_APPLIANCES (false), //
	BOOKS_AND_DINING_GUIDES (false), //
	COOK_BOOKS (false), //
	KITCHEN_TOOLS (false), //
	SLEEP (false), //
	FOOD_CONTAINERS (false),
	SNACK_BARS (false), //
	PUFFED_SNACKS (false), //
	CHIPS_CRISPS_CRACKERS (false);
	
	private boolean parentCategory;
	
	CategoryType(boolean parentCategory) {
		this.parentCategory = parentCategory;
	}

	/**
	 * @return the parentCategory
	 */
	public boolean isParentCategory() {
		return parentCategory;
	}
}
