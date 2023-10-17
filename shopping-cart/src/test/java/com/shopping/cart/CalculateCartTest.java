package com.shopping.cart;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CalculateCartTest {

	private CalculateCart cart;

	@Before
	public void setUp() throws Exception {
		cart = new CalculateCart();
	}

	
	@Test
	public void test_calculateTotalCost() {
		List<String> shoppingList = List.of("Apple", "Apple", "Banana", "Melon", "Melon", "Lime", "Lime", "Lime");
		cart.calculateTotalCost(shoppingList);
	   
	}

}
