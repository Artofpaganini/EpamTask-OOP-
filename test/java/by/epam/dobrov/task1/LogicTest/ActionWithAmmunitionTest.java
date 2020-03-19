package by.epam.dobrov.task1.LogicTest;

import by.epam.dobrov.task1.Ammunition.MotorcycleGloves;
import by.epam.dobrov.task1.Ammunition.MotorcycleHelmet;
import by.epam.dobrov.task1.AmmunitionShop.Shop;
import by.epam.dobrov.task1.Logic.ActionWithAmmunition;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ActionWithAmmunitionTest {

    private Shop shop;
    private ActionWithAmmunition actionWithAmmunition;

    @Before
    public void createNewActionsWithAmmunitions() {
        actionWithAmmunition = new ActionWithAmmunition(shop);
    }

    @Test
    public void newListSize_ShouldBeMoreThanZero() {

        List<MotorcycleHelmet> motorcycleHelmets = new ArrayList<>();
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "Shoei Neotec", 10, 30, "Polyurethane", "Plastic"));
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "Shark Evo", 2220, 20, "Polyurethane", "Plastic"));

        Assert.assertTrue(actionWithAmmunition.isAmmunitionListNotEmpty(motorcycleHelmets));
    }

    @Test
    public void newInputIndexValidation_ShouldBeTrue() {

        String value1 = "13";
        String value2 = "-2";
        String value3 = "sdf123-e";

        Assert.assertTrue(actionWithAmmunition.isInputIndexValidationTrue(value1));

        Assert.assertTrue(actionWithAmmunition.isInputIndexValidationTrue(value2));

        Assert.assertFalse(actionWithAmmunition.isInputIndexValidationTrue(value3));

    }

    @Test
    public void newYesNoValidation_ShouldBeTrue() {

        String value1 = "1";
        String value2 = "321";

        Assert.assertTrue(actionWithAmmunition.isYesNoValidationTrue(value1));

        Assert.assertFalse(actionWithAmmunition.isYesNoValidationTrue(value2));

    }

    @Test
    public void newInputIndexNumber_ShouldBeInRangeListSize() {

        int value1 = 1;
        int value2 = 2;

        List<MotorcycleHelmet> motorcycleHelmets = new ArrayList<>();
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "Shoei Neotec", 10, 30, "Polyurethane", "Plastic"));
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "Shark Evo", 2220, 20, "Polyurethane", "Plastic"));
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "Shark Evo", 2220, 20, "Polyurethane", "Plastic"));
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "Shark Evo", 2220, 20, "Polyurethane", "Plastic"));

        Assert.assertTrue(actionWithAmmunition.isInputIndexNumberBeInRangeListSize(value1, motorcycleHelmets));

        List<MotorcycleGloves> motorcycleGloves = new ArrayList<>();
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "Acerbis", 10, 10, "S", "Cotton"));

        Assert.assertFalse(actionWithAmmunition.isInputIndexNumberBeInRangeListSize(value2, motorcycleGloves));


    }

    @Test
    public void newNumber_ShouldEqualsMinusOne() {

        int value1 = -1;
        int value2 = -2;

        Assert.assertTrue(actionWithAmmunition.isDenial(value1));

        Assert.assertFalse(actionWithAmmunition.isDenial(value2));

    }

    @Test
    public void newNumber_ShouldEqualsZero() {
        int value1 = 0;
        int value2 = 5;

        Assert.assertTrue(actionWithAmmunition.isYesOrNo(value1));

        Assert.assertFalse(actionWithAmmunition.isYesOrNo(value2));


    }

    @Test
    public void newInputMaxMinValue_ShouldBeTrue() {

        String value1 = "123";
        String value2 = "dfd";

        Assert.assertTrue("validation was passed", actionWithAmmunition.isMaxMinValidationTrue(value1));

        Assert.assertFalse("validation was passed", actionWithAmmunition.isMaxMinValidationTrue(value2));

    }

    @Test
    public void newMinPriceAndMaxPrice_ShouldHaveRightValues() {

        double minPrice = 1;
        double maxPrice = 12;

        Assert.assertTrue("validation was passed", actionWithAmmunition.isMinPriceAndMaxPriceHaveRightValues(minPrice, maxPrice));


    }

    @Test
    public void newItemPrice_ShouldBeInRangeMinMaxPrice() {
        double itemPrice = 10;
        double minPrice = 9;
        double maxPrice = 12;

        Assert.assertTrue(actionWithAmmunition.isItemPriceInRangeMinMaxPrice(itemPrice, minPrice, maxPrice));
    }

    @After
    public void cleanNewActionsWithAmmunitions() {
        actionWithAmmunition = null;
    }

}
