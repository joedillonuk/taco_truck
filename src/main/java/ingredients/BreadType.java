package ingredients;

import behaviours.IGetEaten;

public enum BreadType implements IGetEaten {
    BUN("bun", 150, true),
    FLOURTORTILLA("flour tortilla", 138, true),
    CORNTORTILLA("corn tortilla", 96, true),
    SUB("sub", 320, true),
    BLOOMER("bloomer", 120, true),
    CIABATTA("ciabatta", 295, true),
    BUNLESS("bunless", 0, true);

    private final String name;
    private final int calories;
    private final boolean vegetarian;

    private BreadType(String name, int calories, boolean vegetarian) {
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
