package ingredients;

import behaviours.IGetEaten;

public class Topping extends Ingredient{

    public Topping(double cost, IGetEaten iGetEaten) {
        super(cost, iGetEaten);
    }
}
