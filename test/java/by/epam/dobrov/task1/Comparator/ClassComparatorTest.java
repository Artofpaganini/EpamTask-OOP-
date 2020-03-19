package by.epam.dobrov.task1.Comparator;

import by.epam.dobrov.task1.Ammunition.MotorcycleHelmet;
import by.epam.dobrov.task1.AmmunitionShop.Shop;
import by.epam.dobrov.task1.Comparator.ClassComparator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ClassComparatorTest {

    private ClassComparator comparator;
    private Shop shop;

    @Before
    public void createComparator() {
        comparator = new ClassComparator();
    }

    @Test
    public void test_ShouldBELessThan() {
        MotorcycleHelmet motorcycleHelmet1 = new MotorcycleHelmet("Helm", "Shoei Neotec", 10, 20, "Polyurethane", "Plastic");
        MotorcycleHelmet motorcycleHelmet2 = new MotorcycleHelmet("Helm", "Shoei Neotec", 10, 30, "Polyurethane", "Plastic");

        int result = comparator.compare(motorcycleHelmet1, motorcycleHelmet2);
        Assert.assertTrue("expected to be less than", result <= -1);
    }

    @Test
    public void test_ShouldBeEqual() {

        MotorcycleHelmet motorcycleHelmet1 = new MotorcycleHelmet("Helm", "Shoei Neotec", 10, 30, "Polyurethane", "Plastic");
        MotorcycleHelmet motorcycleHelmet2 = new MotorcycleHelmet("Helm", "Shoei Neotec", 10, 30, "Polyurethane", "Plastic");

        int result = comparator.compare(motorcycleHelmet1, motorcycleHelmet2);
        Assert.assertTrue("expected to be equal", result == 0);
    }

    @Test
    public void test_ShouldBeGreaterThan() {
        MotorcycleHelmet motorcycleHelmet1 = new MotorcycleHelmet("Helm", "Shoei Neotec", 10, 60, "Polyurethane", "Plastic");
        MotorcycleHelmet motorcycleHelmet2 = new MotorcycleHelmet("Helm", "Shoei Neotec", 10, 30, "Polyurethane", "Plastic");

        int result = comparator.compare(motorcycleHelmet1, motorcycleHelmet2);
        Assert.assertTrue("expected to be greater than", result >= 1);
    }
}