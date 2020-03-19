package by.epam.dobrov.task1.Ammunition;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MotorcycleJacketTest {

    private final double EPS = 1e-9;
    private MotorcycleJacket motorcycleJacket;


    @Before
    public void createNewMotocycleBoots() {
        motorcycleJacket = new MotorcycleJacket("Jacket", "AFX North America Inc.", 10, 110,
                "S", "Red", "Skin");
    }

    @Test
    public void name_ShouldBeEquals() {
        Assert.assertEquals("Jacket", motorcycleJacket.getName());
    }

    @Test
    public void manufacturer_ShouldBeEquals() {
        Assert.assertEquals("AFX North America Inc.", motorcycleJacket.getManufacturer());
    }

    @Test
    public void price_ShouldBeEquals() {
        Assert.assertEquals(10, motorcycleJacket.getPrice(), EPS);
    }

    @Test
    public void weight_ShouldBeEquals() {
        Assert.assertEquals(110, motorcycleJacket.getWeight(), EPS);
    }

    @Test
    public void price_ShouldBePositive() {
        Assert.assertTrue(motorcycleJacket.isPricePositive());
    }

    @Test
    public void weight_ShouldBePositive() {
        Assert.assertTrue(motorcycleJacket.isWeightPositive());
    }

    @Test
    public void size_ShouldBeEquals() {
        Assert.assertEquals("S", motorcycleJacket.getJacketSize());
    }

    @Test
    public void color_ShouldBeEquals() {
        Assert.assertEquals("Red", motorcycleJacket.getColor());
    }

    @Test
    public void material_ShouldBeEquals() {
        Assert.assertEquals("Skin", motorcycleJacket.getJacketMaterial());
    }
}