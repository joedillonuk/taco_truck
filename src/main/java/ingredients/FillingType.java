package ingredients;

import behaviours.IGetEaten;

public enum FillingType implements IGetEaten {
    BEEF("beef", 500, false),
    PORK("pork", 600, false),
    CHICKEN("chicken", 400, false),
    FISH("fish", 300, false),
    JACKFRUIT("jackfruit", 400, true),
    SEITAN("seitan", 400, true),
    VEGGIEPATTY("veggie burger", 500, true),
    CORONATIONCHICKEN("coronation chicken", 500, false),
    TUNAMAYO("tuna mayonnaise", 400, false);

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
