package com.shopping.cart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CalculateCart {

	public double calculateTotalCost(List<String> shoppingList) {
		Map<String, Integer> itemCounts = new HashMap<>();
		double totalCost = 0.0;

		for (String item : shoppingList) {
			itemCounts.put(item, itemCounts.getOrDefault(item, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : itemCounts.entrySet()) {
			String item = entry.getKey();
			int count = entry.getValue();

			if (item.equals("Apple")) {
				totalCost += count * 35;
			} else if (item.equals("Banana")) {
				totalCost += count * 20;
			} else if (item.equals("Melon")) {
				totalCost += (count / 2 + count % 2) * 50;
			} else if (item.equals("Lime")) {
				totalCost += (count / 3 * 2 + count % 3) * +15;
			}
		}

		return totalCost;
	}

}
