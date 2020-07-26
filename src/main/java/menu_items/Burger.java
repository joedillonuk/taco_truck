package menu_items;

import ingredients.Bread;
import ingredients.BreadType;
import ingredients.FillingType;
import ingredients.Ingredient;

public class Burger extends Food{

    private FoodType foodType;
    private Bread bread;

    public Burger(String name) {
        super(name);
        foodType = FoodType.BURGER;
        bread = new Bread(0.5, BreadType.BUN);
        this.addIngredient(bread);


    }

    public FoodType getFoodType() {
        return foodType;
    }



}
