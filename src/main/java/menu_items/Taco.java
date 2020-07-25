package menu_items;

public class Taco extends Food{

    private FoodType foodType;

    public Taco(String name) {
        super(name);
        foodType = FoodType.TACO;

    }

    public FoodType getFoodType() {
        return foodType;
    }
}
