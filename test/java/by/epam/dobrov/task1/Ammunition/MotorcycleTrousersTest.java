package by.epam.dobrov.task1.Ammunition;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MotorcycleTrousersTest {

    private final double EPS = 1e-9;
    private MotorcycleTrousers motorcycleTrousers;

    private  static  final Logger logger = LoggerFactory.getLogger(MotorcycleTrousersTest.class);

    @Before
    public void createNewMotocycleBoots() {
        motorcycleTrousers = new MotorcycleTrousers("Trousers", "Alpinestars", 10, 120, "S", "Red", "Skin");
    }

    @Test
    public void name_ShouldBeEquals() {
        Assert.assertEquals("Trousers", motorcycleTrousers.getName());
    }

    @Test
    public void manufacturer_ShouldBeEquals() {
        Assert.assertEquals("Alpinestars", motorcycleTrousers.getManufacturer());
    }

    @Test
    public void price_ShouldBeEquals() {
        Assert.assertEquals(10, motorcycleTrousers.getPrice(), EPS);
    }

    @Test
    public void weight_ShouldBeEquals() {
        Assert.assertEquals(120, motorcycleTrousers.getWeight(), EPS);
    }

    @Test
    public void price_ShouldBePositive() {
        Assert.assertTrue(motorcycleTrousers.isPricePositive());
    }

    @Test
    public void weight_ShouldBePositive() {
        Assert.assertTrue(motorcycleTrousers.isWeightPositive());
    }

    @Test
    public void size_ShouldBeEquals() {
        Assert.assertEquals("S", motorcycleTrousers.getTrousersSize());
    }

    @Test
    public void color_ShouldBeEquals() {
        Assert.assertEquals("Red", motorcycleTrousers.getColor());
    }

    @Test
    public void material_ShouldBeEquals() {
        Assert.assertEquals("Skin", motorcycleTrousers.getTrousersMaterial());
    }

}