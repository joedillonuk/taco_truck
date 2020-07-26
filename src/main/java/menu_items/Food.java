package menu_items;

import behaviours.IGetEaten;
import behaviours.ISpicy;
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

        for(Ingredient ingredient : this.ingredients){
            cost += ingredient.getCost();
        }

        return cost;
    }

    public int getSpiceLevel(){
        int spiceLevel = 0;

        for(Ingredient ingredient : this.ingredients){
            if(ingredient instanceof ISpicy){
                if(((ISpicy) ingredient).getSpicy() > spiceLevel){
                    spiceLevel = ((ISpicy) ingredient).getSpicy();
                }
            }
        }
        return spiceLevel;
    }

    public String getSpiciestIngredient(){
        int spiceLevel = 0;
        String spiciestIngredient = null;

        for(Ingredient ingredient : this.ingredients){
            if(ingredient instanceof ISpicy){
                if(((ISpicy) ingredient).getSpicy() > spiceLevel){
                    spiceLevel = ((ISpicy) ingredient).getSpicy();
                    spiciestIngredient = ingredient.getName();
                }
            }
        }
        return spiciestIngredient;
    }


    public double getSellPrice() {
        double sellPrice = (getCost()* 3);
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
    } else{
       ingredients.add(ingredient);
       incrementIngredient(ingredient);}
    }


    public void incrementIngredient(Ingredient ingredient){
        if(ingredient instanceof Bread){breadCount++;}
        if(ingredient instanceof Filling){fillingCount++;}
        if(ingredient instanceof Topping){toppingCount++;}
        if(ingredient instanceof Sauce){sauceCount++;}
    }

    public int getBreadCount() {
        return breadCount;
    }

    public int getFillingCount() {
        return fillingCount;
    }

    public int getToppingCount() {
        return toppingCount;
    }

    public int getSauceCount() {
        return sauceCount;
    }

    public boolean isVegetarian(){
        boolean vegetarian = true;
        for(Ingredient ingredient : this.ingredients){
            if(ingredient.getVegetarian() == false){
                vegetarian = false;
            }
        }
        return vegetarian;
    }

    public void listNonVegItems(){
        if(this.isVegetarian()){
            System.out.println("This item is vegetarian.");
        }else {

            ArrayList nonVegItems = new ArrayList<IGetEaten>();
            System.out.println("This item contains the following non-vegetarian items:");
            for (Ingredient ingredient : this.ingredients) {
                if (ingredient.getVegetarian() == false) {
                    nonVegItems.add(ingredient);
                    System.out.println(ingredient.getName());
                }
            }
        }
    }

    public int calculateCalories(){
        int total = 0;
        for(Ingredient ingredient : this.ingredients){
            total += ingredient.getCalories();
        }
        return total;
    }
}
