package menu_items;

import ingredients.FillingType;

public class Burger extends Food{

    private FoodType foodType;

    public Burger(String name) {
        super(name);
        foodType = FoodType.BURGER;

    }

    public FoodType getFoodType() {
        return foodType;
    }


}
