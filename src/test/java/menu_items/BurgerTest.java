package menu_items;

import ingredients.Bread;
import ingredients.BreadType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BurgerTest {

    private Burger burger;
    private Bread bread;

    @Before
    public void before(){
        burger = new Burger("Beef burger");
        bread = new Bread(2, BreadType.BUN);
    }

    @Test
    public void canGetName(){
        assertEquals("Beef burger", burger.getName());
    }

    @Test
    public void canGetType(){
        assertEquals(FoodType.BURGER, burger.getFoodType());
    }

    @Test
    public void ingredientsStartAtZero(){
        assertEquals(0, burger.getIngredients().size());
    }

    @Test
    public void canAddBun(){
        burger.addBread(bread);
        assertEquals(1, burger.getIngredients().size());
    }

}