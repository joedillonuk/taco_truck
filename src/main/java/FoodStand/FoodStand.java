package FoodStand;

import ingredients.Ingredient;
import menu_items.Burger;
import menu_items.Food;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class FoodStand {

    private String name;
    private ArrayList<Food> menuItems;
    private double till;
    private HashMap<Food, Integer> foodStock;

    public FoodStand(String name) {
        this.name = name;
        menuItems = new ArrayList<Food>();
        this.till = 100.00;
        foodStock = new HashMap<Food, Integer>();


    }

    public String getName() {
        return name;
    }

    public ArrayList<Food> getMenuItems() {
        return menuItems;
    }

    public double getTill() {
        return till;
    }

    public void displayMenu() {
        System.out.println("");
        System.out.println(this.getName() + " Menu:");
        System.out.println("");
        DecimalFormat df = new DecimalFormat("####0.00");
        for (Food food : menuItems) {
            if (food instanceof Burger) {
                System.out.println(food.getName());
                System.out.println("£" + df.format(food.getSellPrice()) + " | " + food.calculateCalories() + " calories.");
                System.out.println("");
                for (Ingredient ingredient : food.getIngredients()) {
                    System.out.println(ingredient.getName());
                }
                System.out.println("");
            }
        }

    }

    public void addToMenu(Food food, int quantity) {
        this.menuItems.add(food);
        foodStock.put(food, quantity++);
    }

    public void displayStockCount() {

        Set<Food> keys = foodStock.keySet();
        for (Food key : keys) {
            System.out.println(foodStock.get(key) + " remaining: " + key.getName());
        }

    }

    public double potentialProfit() {
        double costOfAll = 0;
        double sellPriceOfAll = 0;
        for (Food food : menuItems) {
            costOfAll += food.getCost();
            sellPriceOfAll += food.getSellPrice();
        }
        return sellPriceOfAll - costOfAll;
    }

    public Food sellFood(Food food) {
        int count = foodStock.get(food);
        if(count > 0){
        this.till += food.getSellPrice();
        decreaseStock(food);
        return food;}else{
            System.out.println("Sorry. We're out of " + food.getName());
        }
        return food;
    }


    public void decreaseStock(Food food) {
        int count = foodStock.get(food);
        foodStock.put(food, count - 1);
    }

}