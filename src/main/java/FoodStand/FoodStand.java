package FoodStand;

import ingredients.Ingredient;
import menu_items.Burger;
import menu_items.Food;

import java.util.ArrayList;

public class FoodStand {

    private String name;
    private ArrayList<Food> menuItems;

    public FoodStand(String name){
        this.name = name;
        menuItems = new ArrayList<Food>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<Food> getMenuItems() {
        return menuItems;
    }

    public void displayMenu(){
        System.out.println("");
        System.out.println("Menu:");
        for(Food food : menuItems){
            if(food instanceof Burger){
                System.out.println(food.getName() + " " +food.calculateCalories() + " calories.");
                for(Ingredient ingredient : food.getIngredients()){
                    System.out.println(ingredient.getName());
                }
                System.out.println("");
            }
        }

    }

    public void addToMenu(Food food){
        this.menuItems.add(food);
    }
}
