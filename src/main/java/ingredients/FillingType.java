package ingredients;

import behaviours.IGetEaten;

public enum FillingType implements IGetEaten {
    BEEF("beef", 500, false),
    PORK("pork", 600, false),
    CHICKEN("chicken", 283, false),
    FISH("fish", 250, false),
    JACKFRUIT("jackfruit", 157, true),
    SEITAN("seitan", 100, true),
    VEGGIEPATTY("veggie burger", 300, true),
    CORONATIONCHICKEN("coronation chicken", 300, false),
    TUNAMAYO("tuna mayonnaise", 187, false);

    private final String name;
    private final int calories;
    private final boolean vegetarian;

    private FillingType(String name, int calories, boolean vegetarian) {
        this.name = name;
        this.calories = calories;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public int getCalories(){
        return calories;
    }

    public boolean getVegetarian() {
        return vegetarian;
    }

}
