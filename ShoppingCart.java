package javaact;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Integer> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    // Method to add items to the cart
    public void addItem(String itemName, int quantity) {
        if (items.containsKey(itemName)) {
            int currentQuantity = items.get(itemName);
            items.put(itemName, currentQuantity + quantity);
        } else {
            items.put(itemName, quantity);
        }
    }

    // Method to remove items from the cart
    public void removeItem(String itemName, int quantity) {
        if (items.containsKey(itemName)) {
            int currentQuantity = items.get(itemName);
            if (currentQuantity <= quantity) {
                items.remove(itemName);
            } else {
                items.put(itemName, currentQuantity - quantity);
            }
        }
    }

    // Method to calculate total price
    public double calculateTotalPrice(Map<String, Double> itemPrices) {
        double totalPrice = 0.0;
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            String itemName = entry.getKey();
            int quantity = entry.getValue();
            if (itemPrices.containsKey(itemName)) {
                double itemPrice = itemPrices.get(itemName);
                totalPrice += itemPrice * quantity;
            }
        }
        return totalPrice;
    }

    // Method to display cart details
    public void displayCart() {
        System.out.println("Items in the cart:");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + " - Quantity: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Create an object of the ShoppingCart class
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem("Apple", 2);
        cart.addItem("Banana", 3);
        cart.addItem("Orange", 1);

        // Display the cart details
        cart.displayCart();

        // Remove items from the cart
        cart.removeItem("Banana", 1);

        // Display the updated cart details
        cart.displayCart();

        // Define item prices
        Map<String, Double> itemPrices = new HashMap<>();
        itemPrices.put("Apple", 0.5);
        itemPrices.put("Banana", 0.4);
        itemPrices.put("Orange", 0.6);

        // Calculate and display the total price
        double totalPrice = cart.calculateTotalPrice(itemPrices);
        System.out.println("Total Price: $" + totalPrice);
    }
}
