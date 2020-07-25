package menu_items;

public class Sandwich extends Food{

    private FoodType foodType;

    public Sandwich(String name) {
        super(name);
        foodType = FoodType.SANDWICH;

    }

    public FoodType getFoodType() {
        return foodType;
    }
}
