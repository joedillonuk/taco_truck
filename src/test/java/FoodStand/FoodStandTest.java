package FoodStand;

import ingredients.*;
import menu_items.Burger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoodStandTest {

    private FoodStand foodStand;

    // BURGER 1
    private Topping topping1;
    private Filling filling1;
    private Sauce sauce1;
    private Burger burger1;

    // BURGER 2
    private Topping topping2;
    private Filling filling2;
    private Sauce sauce2;
    private Burger burger2;

    //BURGER 3
    private Topping topping3a;
    private Topping topping3b;
    private Topping topping3c;
    private Filling filling3;
    private Sauce sauce3;
    private Burger burger3;

    //VEG BURGER
    private Filling vegFilling;
    private Topping vegTopping;
    private Sauce vegSauce;
    private Burger vegBurger;


    @Before
    public void before(){
        foodStand = new FoodStand("CodeScran");

        //BURGER 1
        burger1 = new Burger("The Standard");
        filling1 = new Filling(1.50, FillingType.BEEF);
        topping1 = new Topping(0.5, ToppingType.CHEESE);
        sauce1 = new Sauce(0.25, SauceType.KETCHUP);
        burger1.addIngredient(filling1);
        burger1.addIngredient(topping1);
        burger1.addIngredient(sauce1);

        //BURGER 2
        burger2 = new Burger("The Kevin");
        filling2 = new Filling(1.50, FillingType.BEEF);
        topping2 = new Topping(0.5, ToppingType.BACON);
        sauce2 = new Sauce(0.5, SauceType.MAYONNAISE);
        burger2.addIngredient(filling2);
        burger2.addIngredient(topping2);
        burger2.addIngredient(sauce2);

        //BURGER 3
        burger3 = new Burger("The Chicken Grilla");
        filling3 = new Filling(1.50, FillingType.CHICKEN);
        topping3a = new Topping(0.5, ToppingType.CHILIS);
        topping3b = new Topping(0.5, ToppingType.ONION);
        topping3c = new Topping(0.5, ToppingType.LETTUCE);
        sauce3 = new Sauce(0.25, SauceType.BBQ);
        burger3.addIngredient(filling3);
        burger3.addIngredient(topping3a);
        burger3.addIngredient(topping3b);
        burger3.addIngredient(topping3c);
        burger3.addIngredient(sauce3);

        //VEG BURGER
        vegBurger = new Burger("I'm Aff It");
        vegFilling = new Filling(1.50, FillingType.VEGGIEPATTY);
        vegTopping = new Topping(0.5, ToppingType.AVOCADO);
        vegSauce = new Sauce(0.25, SauceType.CHIPOTLE);
        vegBurger.addIngredient(vegFilling);
        vegBurger.addIngredient(vegTopping);
        vegBurger.addIngredient(vegSauce);

    }

    @Test
    public void menuStartsEmpty(){
        assertEquals(0, foodStand.getMenuItems().size());

    }


    @Test
    public void canAddToMenu(){
        foodStand.addToMenu(burger1, 10);
        assertEquals(1, foodStand.getMenuItems().size());

    }

    @Test
    public void canAddToMenu_Multiple(){
        foodStand.addToMenu(burger1, 10);
        foodStand.addToMenu(burger2, 10);
        foodStand.addToMenu(burger3, 10);
        foodStand.addToMenu(vegBurger, 10);
        assertEquals(4, foodStand.getMenuItems().size());
    }

//    @Test
//    public void canDisplayMenu(){
//        foodStand.addToMenu(burger1, 10);
//        foodStand.addToMenu(burger2, 10);
//        foodStand.addToMenu(burger3, 10);
//        foodStand.addToMenu(vegBurger, 10);
//        foodStand.displayMenu();
//    }

    @Test
    public void canCalculatePotentialProfit(){
        foodStand.addToMenu(burger1, 10);
        foodStand.addToMenu(burger2, 10);
        foodStand.addToMenu(burger3, 10);
        foodStand.addToMenu(vegBurger, 10);
        assertEquals(24.5, foodStand.potentialProfit(), 0.2);
    }

//    @Test // Changed sale to decreases value in hashmap rather than remove from array
//    public void canSellFood(){
//        foodStand.addToMenu(burger1, 10);
//        foodStand.addToMenu(burger2, 10);
//        foodStand.addToMenu(burger3, 10);
//        foodStand.addToMenu(vegBurger, 10);
//        foodStand.sellFood(burger2);
//        assertEquals(3, foodStand.getMenuItems().size());
//    }

    @Test
    public void sellingFoodIncreaseTill(){
        foodStand.addToMenu(burger1, 10);
        foodStand.addToMenu(burger2, 10);
        foodStand.addToMenu(burger3, 10);
        foodStand.addToMenu(vegBurger, 10);
        foodStand.sellFood(burger2);
        assertEquals(109, foodStand.getTill(), 0);
    }

//    @Test
//    public void displayStock(){
//        foodStand.addToMenu(burger1, 10);
//
//        foodStand.addToMenu(burger2, 10);
//        foodStand.addToMenu(burger3, 10);
//        foodStand.addToMenu(vegBurger, 10);
//        foodStand.displayStockCount();
//
//    }

//    @Test
//    public void stockDecreasesUponSale(){
//        foodStand.addToMenu(burger1, 10);
//        foodStand.addToMenu(burger2, 10);
//        foodStand.addToMenu(burger3, 10);
//        foodStand.addToMenu(vegBurger, 10);
//        foodStand.sellFood(burger2);
//        foodStand.sellFood(burger2);
//        foodStand.sellFood(burger3);
//        foodStand.displayStockCount();
//
//    }

    @Test
    public void cannotSellIfNoStock(){
        foodStand.addToMenu(burger1, 10);
        foodStand.addToMenu(burger2, 1);
        foodStand.addToMenu(burger3, 10);
        foodStand.addToMenu(vegBurger, 10);
        foodStand.sellFood(burger2);
        foodStand.sellFood(burger2);
        foodStand.sellFood(burger3);
        foodStand.displayStockCount();
    }

}