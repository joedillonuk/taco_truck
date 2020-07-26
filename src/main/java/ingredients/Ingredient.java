package ingredients;

import behaviours.IGetEaten;
import behaviours.ISpicy;

public abstract class Ingredient {

    private double cost;
    private IGetEaten iGetEaten;

    public Ingredient(double cost, IGetEaten iGetEaten) {
        this.cost = cost;
        this.iGetEaten = iGetEaten;
    }

    public String getName(){
        return iGetEaten.getName();
    }

    public int getCalories(){
        return iGetEaten.getCalories();
    }

    public boolean getVegetarian() {
        return iGetEaten.getVegetarian();
    }

    public double getCost(){
        return this.cost;
    }

    public IGetEaten getIGetEaten(){
        return this.iGetEaten;
    }



}
