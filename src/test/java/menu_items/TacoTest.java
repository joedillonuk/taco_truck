package menu_items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TacoTest {

    private Taco taco;

    @Before
    public void before(){
        taco = new Taco("Migas");
    }

    @Test
    public void canGetName(){
        assertEquals("Migas", taco.getName());
    }

    @Test
    public void getFoodType() {
        assertEquals(FoodType.TACO, taco.getFoodType());
    }

    @Test
    public void ingredientsStartAtZero(){
        assertEquals(0, taco.getIngredients().size());
    }
}