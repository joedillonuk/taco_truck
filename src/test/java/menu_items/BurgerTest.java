package menu_items;

import ingredients.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BurgerTest {

    private Burger burger;
    private Bread bread;
    private Topping topping;
    private Filling filling;
    private Sauce sauce;
    private Filling vegFilling;
    private Topping vegTopping;

    @Before
    public void before(){
        burger = new Burger("Beef burger");
        bread = new Bread(2, BreadType.BUN);
        topping = new Topping(0.5, ToppingType.BACON);
        filling = new Filling(1.2, FillingType.BEEF);
        sauce = new Sauce(0.2, SauceType.KETCHUP);
        vegFilling = new Filling(0.5, FillingType.JACKFRUIT);
        vegTopping = new Topping(0.5, ToppingType.AVOCADO);
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
    public void startsWithBun(){
        assertEquals(1, burger.getIngredients().size());
        assertEquals("bun", burger.getIngredients().get(0).getName());
    }

    @Test
    public void canAddIngredient(){
    burger.addIngredient(filling);
        assertEquals(2, burger.getIngredients().size());
    }

    @Test
    public void canAddSeveralIngredients(){
        burger.addIngredient(filling);
        burger.addIngredient(topping);
        burger.addIngredient(sauce);
        assertEquals(4, burger.getIngredients().size());

    }

    @Test
    public void canCountBreadInstanceSingle(){
        assertEquals(1, burger.getBreadCount());
    }


    @Test
    public void canPreventMoreThanOneBread(){
        burger.addIngredient(bread);
        burger.addIngredient(bread);
        burger.addIngredient(bread);
        assertEquals(1, burger.getBreadCount());

    }

    @Test
    public void canConfirmVegetarian_False(){
        burger.addIngredient(filling);
        burger.addIngredient(topping);
        burger.addIngredient(sauce);
        assertEquals(false, burger.isVegetarian());

    }

    @Test
    public void canConfirmVegetarian_True(){
        burger.addIngredient(vegFilling);
        burger.addIngredient(vegTopping);
        burger.addIngredient(sauce);
        assertEquals(true, burger.isVegetarian());

    }

    @Test
    public void canDisplayNonVegIngredients(){
        burger.addIngredient(filling);
        burger.addIngredient(topping);
        burger.addIngredient(sauce);
        burger.listNonVegItems();
        assertEquals(false, burger.isVegetarian());
    }

    @Test
    public void canCalculateCalories(){
        burger.addIngredient(filling);
        burger.addIngredient(topping);
        burger.addIngredient(sauce);
        assertEquals(770, burger.calculateCalories());
    }




}