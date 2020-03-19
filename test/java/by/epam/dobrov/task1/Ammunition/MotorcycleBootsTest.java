package by.epam.dobrov.task1.Ammunition;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MotorcycleBootsTest {
    private final double EPS = 1e-9;
    private MotorcycleBoots motorcycleBoots;

    @Before
    public void createNewMotocycleBoots() {
        motorcycleBoots = new MotorcycleBoots("Boots", " AGV", 10, 20, 42, "Zipper", "Red");
    }

    @Test
    public void name_ShouldBeEquals() {
        Assert.assertEquals("Boots", motorcycleBoots.getName());
    }

    @Test
    public void manufacturer_ShouldBeEquals() {
        Assert.assertEquals(" AGV", motorcycleBoots.getManufacturer());
    }

    @Test
    public void price_ShouldBeEquals() {
        Assert.assertEquals(10, motorcycleBoots.getPrice(), EPS);
    }

    @Test
    public void weight_ShouldBeEquals() {
        Assert.assertEquals(20, motorcycleBoots.getWeight(), EPS);
    }

    @Test
    public void bootsSize_ShouldBeEquals() {
        Assert.assertEquals(42, motorcycleBoots.getBootsSize(), EPS);
    }

    @Test
    public void lacing_ShouldBeEquals() {
        Assert.assertEquals("Zipper", motorcycleBoots.getLacing());
    }

    @Test
    public void color_ShouldBeEquals() {
        Assert.assertEquals("Red", motorcycleBoots.getColor());
    }

    @Test
    public void price_ShouldBePositive() {
        Assert.assertTrue(motorcycleBoots.isPricePositive());
    }

    @Test
    public void weight_ShouldBePositive() {
        Assert.assertTrue(motorcycleBoots.isWeightPositive());
    }

    @Test
    public void size_ShouldForAnAdult() {
        Assert.assertTrue(motorcycleBoots.isThisSizeForAnAdult());
    }

}