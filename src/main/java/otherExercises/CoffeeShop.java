package otherExercises;
//Write a class called CoffeeShop, which has three instance variables:
//
//name : a string (basically, of the shop)
//menu : an array of items (of type MenuItem), with each item containing the item (name of the item), type (whether a food or a drink) and price.
//orders : an empty array
//and seven methods:
//
//addOrder: adds the name of the item to the end of the orders array if it exists on the menu. Otherwise, return "This item is currently unavailable!"
//fulfillOrder: if the orders array is not empty, return "The {item} is ready!". If the orders array is empty, return "All orders have been fulfilled!"
//listOrders: returns the list of orders taken, otherwise, an empty array.
//dueAmount: returns the total amount due for the orders taken.
//cheapestItem: returns the name of the cheapest item on the menu.
//drinksOnly: returns only the item names of type drink from the menu.
//foodOnly: returns only the item names of type food from the menu.
//IMPORTANT: Orders are fulfilled in a FIFO (first-in, first-out) order.

//Examples
//tcs.addOrder("hot cocoa") ➞ "This item is currently unavailable!"
//// Tesha's coffee shop does not sell hot cocoa
//tcs.addOrder("iced tea") ➞ "This item is currently unavailable!"
//// specifying the variant of "iced tea" will help the process
//
//tcs.addOrder("cinnamon roll") ➞  "Order added!"
//tcs.addOrder("iced coffee") ➞ "Order added!"
//tcs.listOrders ➞ ["cinnamon roll", "iced coffee"]
//// the list of all the items in the current order
//
//tcs.dueAmount() ➞ 2.17
//
//tcs.fulfillOrder() ➞ "The cinnamon roll is ready!"
//tcs.fulfillOrder() ➞ "The iced coffee is ready!"
//tcs.fulfillOrder() ➞ "All orders have been fulfilled!";
//// all orders have been presumably served
//
//tcs.listOrders() ➞ []
//// an empty array is returned if all orders have been exhausted
//
//tcs.dueAmount() ➞ 0.0
//// no new orders taken, expect a zero payable
//
//tcs.cheapestItem() ➞ "lemonade"
//tcs.foodOnly() ➞ ["tuna sandwich", "ham and cheese sandwich", "bacon and egg", "steak", "hamburger", "cinnamon roll"]
//Notes
//Round off due amount up to two decimal places.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {

    String name = "Boo Boo Coffee";
    List<Item> items = new ArrayList<>();
    List<Item> order = new ArrayList<>();

    private String readFromUser() {
        System.out.println("Enter your order:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }

    private void addOrder() {

        String itemName = readFromUser();

        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).getName().equals(itemName)) {
                order.add(items.get(i));
                System.out.println("Order added!");
                return;
            }
        }
        if (order.size() == 0) {
            System.out.println("The " + itemName + " item is currently unavailable!");
            System.out.println(name + " does not sell " + itemName + ".");
            addOrder();
        }
    }

    private void fulfillOrder() {

        if (order.size() > 0) {
            System.out.println("The " + order.get(0).getName() + " is ready!");
            order.remove(0);
        } else System.out.println("All orders have been fulfilled!");
    }

    private void listOrders() {

        if (order.size() >= 1) {
            System.out.println("Your order: ");
            for (int i = 0; i < order.size(); i++) {
                if (i == (order.size() - 1)) {
                    System.out.println(order.get(i).getName() + ". ");
                } else
                    System.out.print(order.get(i).getName() + ",");
            }
        } else {
            System.out.println("No orders placed.");
        }
    }

    private void dueAmount() {

        double totalAmount = 0.0;
        for (int i = 0; i < order.size(); i++) {
            totalAmount = Math.round((totalAmount + order.get(i).getPrice()) * 100.0) / 100.0;
        }
        System.out.println("Total amount of your order is: " + totalAmount);
    }

    private void cheapestItem() {

        List<Double> itemsPrices = new ArrayList<>();

        for (int i = 0; i < order.size(); i++) {
            itemsPrices.add(order.get(i).getPrice());
        }

        if (order.size() > 0) {
            double cheapestItem = Collections.min(itemsPrices);

            for (int i = 0; i < order.size(); i++) {
                if (cheapestItem == order.get(i).getPrice()) {
                    System.out.println("The cheapest item is " + order.get(i).getName() +
                            " and it costs " + cheapestItem + ".");
                    break;
                }
            }
        } else {
            System.out.println("No orders placed.");
        }
    }

    private void drinksOnly() {

        List<String> drinksList = new ArrayList<>();

        for (int i = 0; i < order.size(); i++) {
            if (!(order.get(i).isFood())) {
                drinksList.add(order.get(i).getName());
            }
        }

        if (drinksList.size() > 0) {
            System.out.println("Drink list: ");

            for (int i = 0; i < drinksList.size(); i++) {
                if (i == (drinksList.size() - 1)) {
                    System.out.println(drinksList.get(i) + ".");
                } else
                    System.out.print(drinksList.get(i) + ", ");
            }
        } else {
            System.out.println("Drink list is empty.");
        }
    }

    private void foodOnly() {

        List<String> foodList = new ArrayList<>();

        for (int i = 0; i < order.size(); i++) {
            if (order.get(i).isFood()) {
                foodList.add(order.get(i).getName());
            }
        }

        if (foodList.size() > 0) {
            System.out.println("Food list: ");

            for (int i = 0; i < foodList.size(); i++) {
                if (i == (foodList.size() - 1)) {
                    System.out.println(foodList.get(i) + ".");
                } else
                    System.out.print(foodList.get(i) + ", ");
            }
        } else {
            System.out.println("Food list is empty.");
        }
    }

    private void actions() {

        System.out.println("Select an option: \n1.Add order \n2.List order \n3.Fulfill Order \n4.Due amount " +
                "\n5.Cheapest Item \n6.Drinks only \n7.Food only \n8.Quit");

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        switch (selection) {
            case 1: {
                addOrder();
                actions();
            }
            case 2: {
                listOrders();
                actions();
            }
            case 3: {
                fulfillOrder();
                actions();
            }
            case 4: {
                dueAmount();
                actions();
            }
            case 5: {
                cheapestItem();
                actions();
            }
            case 6: {
                drinksOnly();
                actions();
            }
            case 7: {
                foodOnly();
                actions();
            }
            case 8:
                System.exit(0);

        }

    }

    public static void main(String[] args) {

        CoffeeShop coffeeShop = new CoffeeShop();
        System.out.println("Welcome to " + coffeeShop.name + "!");

        Item item = new Item();
        item.setName("iced coffee");
        item.setFood(false);
        item.setPrice(1.5);
        coffeeShop.items.add(item);

        Item item2 = new Item();
        item2.setName("hamburger");
        item2.setFood(true);
        item2.setPrice(4.4);
        coffeeShop.items.add(item2);

        Item item3 = new Item();
        item3.setName("lemonade");
        item3.setFood(false);
        item3.setPrice(1.25);
        coffeeShop.items.add(item3);

        Item item4 = new Item();
        item4.setName("tuna sandwich");
        item4.setFood(true);
        item4.setPrice(5.0);
        coffeeShop.items.add(item4);

        Item item5 = new Item();
        item5.setName("steak");
        item5.setFood(true);
        item5.setPrice(7.8);
        coffeeShop.items.add(item5);

        Item item6 = new Item();
        item6.setName("watter");
        item6.setFood(false);
        item6.setPrice(1.0);
        coffeeShop.items.add(item6);

        coffeeShop.actions();
    }
}

class Item {

    private String name;
    private boolean food;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}