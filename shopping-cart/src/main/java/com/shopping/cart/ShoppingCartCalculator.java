package com.shopping.cart;
import java.util.List;

public class ShoppingCartCalculator {
    public static void main(String[] args) { 
    	
    	CalculateCart cart= new CalculateCart();
        List<String> shoppingList = List.of("Apple", "Apple", "Banana", "Melon", "Melon", "Lime", "Lime", "Lime");

        double totalCost = cart.calculateTotalCost(shoppingList);
        System.out.println("Total cost of the shopping:" + totalCost+"p");
    }

   
}