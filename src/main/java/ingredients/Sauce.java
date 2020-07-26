package ingredients;

import behaviours.IGetEaten;
import behaviours.ISpicy;

public class Sauce extends Ingredient implements ISpicy {

    public Sauce(double cost, IGetEaten iGetEaten) {
        super(cost, iGetEaten);
    }


    public int getSpicy() {
        return ((ISpicy)this.getIGetEaten()).getSpicy();
    }
}
