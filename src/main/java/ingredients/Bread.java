package ingredients;

import behaviours.IGetEaten;

public class Bread extends Ingredient{

    private IGetEaten bread;

    public Bread(double cost, IGetEaten bread) {
        super(cost, bread);
        this.bread = bread;
    }


}

