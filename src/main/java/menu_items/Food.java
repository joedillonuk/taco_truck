package menu_items;

import ingredients.FillingType;
import ingredients.Ingredient;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Food {

    private String name;
    private ArrayList<Ingredient> ingredients;


    public Food(String name) {
        this.name = name;
        ingredients = new ArrayList<Ingredient>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        double cost = 0;
        return cost;
    }


    public double getSellPrice() {
        double sellPrice = 0;
        return sellPrice;
    }




    public double calculateSellPrice(){
        double markup = 1.2;
        return this.getCost() * markup;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addFilling(Ingredient filling){
        ingredients.add(filling);
    }

    public void addBread(Ingredient bread){
        ingredients.add(bread);
    }

    public void addTopping(Ingredient topping){
        ingredients.add(topping);
    }

    public void addSauce(Ingredient sauce){
        ingredients.add(sauce);
    }
}
