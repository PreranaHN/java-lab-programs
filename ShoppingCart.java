package javaact;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Double> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    // Method to add items to the cart
    public void addItem(String itemName, double price) {
        if (items.containsKey(itemName)) {
            double currentPrice = items.get(itemName);
            items.put(itemName, currentPrice + price);
        } else {
            items.put(itemName, price);
        }
    }

    // Method to remove items from the cart
    public void removeItem(String itemName) {
        items.remove(itemName);
    }

    // Method to calculate total price of items in the cart
    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (double price : items.values()) {
            totalPrice += price;
        }
        return totalPrice;
    }

    // Method to display items in the cart
    public void displayItems() {
        System.out.println("Items in the cart:");
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            System.out.println(entry.getKey() + " - $" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 999.99);
        cart.addItem("Mouse", 19.99);
        cart.addItem("Keyboard", 49.99);

        cart.displayItems();
        System.out.println("Total Price: $" + cart.calculateTotalPrice());

        cart.removeItem("Mouse");

        cart.displayItems();
        System.out.println("Total Price: $" + cart.calculateTotalPrice());
    }
}
