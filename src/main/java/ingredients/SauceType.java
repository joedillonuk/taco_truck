package ingredients;

import behaviours.IGetEaten;
import behaviours.ISpicy;

public enum SauceType implements IGetEaten, ISpicy {

    KETCHUP("ketchup", 20, true, 0),
    MUSTARD("mustard", 10, true, 0),
    MAYONNAISE("mayonnaise", 94, true, 0),
    CHIPOTLE("chipotle salsa", 10, true, 1000),
    HABANERO("habanero salsa", 10, true, 8000),
    NAGA("naga chili sauce", 10, true, 60000),
    SALSA("salsa", 10, true, 1500),
    SALSAVERDE("salsa verde", 5, true, 2000),
    BBQ("bbq sauce", 50, true, 100);

    private final String name;
    private final int calories;
    private final boolean vegetarian;
    private final int scovilles;

    private SauceType(String name, int calories, boolean vegetarian, int scovilles) {
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
