package ingredients;

import behaviours.IGetEaten;
import behaviours.ISpicy;

public class Topping extends Ingredient{

    public Topping(double cost, IGetEaten iGetEaten) {
        super(cost, iGetEaten);
    }

    public int getSpicy() {
        return ((ISpicy)this.getIGetEaten()).getSpicy();
    }
}
