package by.epam.dobrov.task1.Ammunition;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MotorcycleGlovesTest {
    private final double EPS = 1e-9;
    private MotorcycleGloves motorcycleGloves;


    @Before
    public void createNewMotocycleBoots() {
        motorcycleGloves = new MotorcycleGloves("Gloves", "Acerbis", 10, 10, "S", "Cotton");
    }

    @Test
    public void name_ShouldBeEquals() {
        Assert.assertEquals("Gloves", motorcycleGloves.getName());
    }

    @Test
    public void manufacturer_ShouldBeEquals() {
        Assert.assertEquals("Acerbis", motorcycleGloves.getManufacturer());
    }

    @Test
    public void price_ShouldBeEquals() {
        Assert.assertEquals(10, motorcycleGloves.getPrice(), EPS);
    }

    @Test
    public void weight_ShouldBeEquals() {
        Assert.assertEquals(10, motorcycleGloves.getWeight(), EPS);
    }

    @Test
    public void price_ShouldBePositive() {
        Assert.assertTrue(motorcycleGloves.isPricePositive());
    }

    @Test
    public void weight_ShouldBePositive() {
        Assert.assertTrue(motorcycleGloves.isWeightPositive());
    }

    @Test
    public void size_ShouldBeEquals() {
        Assert.assertEquals("S", motorcycleGloves.getGlovesSize());
    }

    @Test
    public void material_ShouldBeEquals() {
        Assert.assertEquals("Cotton", motorcycleGloves.getGlovesMaterial());
    }


}