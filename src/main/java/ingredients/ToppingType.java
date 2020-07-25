package ingredients;

import behaviours.IGetEaten;
import behaviours.ISpicy;

public enum ToppingType implements IGetEaten, ISpicy {

    LETTUCE("lettuce", 0, true, 0),
    TOMATO("tomato", 10, true, 0),
    ONION("onion", 10, true, 0),
    BACON("chipotle salsa", 10, false, 0),
    MUSHROOM("mushroom", 20, true, 0),
    CHEESE("cheese", 50, true, 0),
    CHILIS("chilis", 20, true, 4000),
    AVOCADO("avocado", 100, true, 0),
    BELLPEPPER("bell pepper", 10, true, 0),
    EGG("egg", 100, true, 0);

    private final String name;
    private final int calories;
    private final boolean vegetarian;
    private final int scovilles;

    private ToppingType(String name, int calories, boolean vegetarian, int scovilles) {
        this.name = name;
        this.calories = calories;
        this.vegetarian = vegetarian;
        this.scovilles = scovilles;
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

    public int getSpicy(){
        return scovilles;
    }


}
