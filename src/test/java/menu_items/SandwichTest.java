package menu_items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SandwichTest {

    private Sandwich sandwich;

    @Before
    public void before(){
        sandwich = new Sandwich("The big wan");
    }

    @Test
    public void canGetName(){
        assertEquals("The big wan", sandwich.getName());
    }

    @Test
    public void canGetType(){
        assertEquals(FoodType.SANDWICH, sandwich.getFoodType());
    }

    @Test
    public void ingredientsStartAtZero(){
        assertEquals(0, sandwich.getIngredients().size());
    }



}