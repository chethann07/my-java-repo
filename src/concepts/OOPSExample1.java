package concepts;

import java.util.Scanner;

class MenuItem {
    private int itemID;
    private String itemName;
    private double price;
    private String category;

    MenuItem(String itemName, double price, String category) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
    }

    public int getItemID() {
        this.itemID = 100;
        this.itemID++;
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

}

class Beverage extends MenuItem {
    private float caffeineContent;

    Beverage(String itemName, double price, String category, float caffeineContent) {
        super(itemName, price, category);
        this.caffeineContent = caffeineContent;
    }

    public float getCaffeineContent() {
        return caffeineContent;
    }

}

class MainCourse extends MenuItem {
    private float calories;
    private String cusineType;

    MainCourse(String itemName, double price, String category, float calories, String cusineType) {
        super(itemName, price, category);
        this.calories = calories;
        this.cusineType = cusineType;
    }

    public float getCalories() {
        return calories;
    }

    public String getCusineType() {
        return cusineType;
    }
}

class Factory {

}

public class OOPSExample1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String input = scan.nextLine();
        // String[] inputArr = input.split(",");
        // int i = 0;
        // String itemName = inputArr[i++];
        // double price = Double.parseDouble(inputArr[i++]);

        scan.close();
    }
}
