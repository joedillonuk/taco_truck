package menu_items;

import ingredients.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Food {

    private String name;
    private ArrayList<Ingredient> ingredients;
    private int breadCount;
    private int fillingCount;
    private int toppingCount;
    private int sauceCount;


    public Food(String name) {
        this.name = name;
        ingredients = new ArrayList<Ingredient>();
        breadCount = 0;
        fillingCount = 0;
        toppingCount = 0;
        sauceCount = 0;

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

//    public void addFilling(Ingredient filling){
//        ingredients.add(filling);
//    }
//
//    public void addBread(Ingredient bread){
//        ingredients.add(bread);
//    }
//
//    public void addTopping(Ingredient topping){
//        ingredients.add(topping);
//    }
//
//    public void addSauce(Ingredient sauce){
//        ingredients.add(sauce);
//    }

    public void addIngredient(Ingredient ingredient){
//        Class ingredientClass = ingredient.getClass();
    if(ingredient instanceof Bread & breadCount > 0){
        System.out.println("Sorry, only one bread type per order!");
    }else{
       ingredients.add(ingredient);
       incrementIngredient(ingredient);}
    }

    public int containsBread(){
        int breadCount = 0;

        for(Ingredient ingredient : this.ingredients){
            if(ingredient instanceof Bread){
                breadCount++;
            }
        }
        return breadCount;

    }

    public void incrementIngredient(Ingredient ingredient){
        if(ingredient instanceof Bread){breadCount++;}
        if(ingredient instanceof Filling){fillingCount++;}
        if(ingredient instanceof Topping){toppingCount++;}
        if(ingredient instanceof Sauce){sauceCount++;}
    }


}
