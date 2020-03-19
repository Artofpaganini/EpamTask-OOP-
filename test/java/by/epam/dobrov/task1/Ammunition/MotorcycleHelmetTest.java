package by.epam.dobrov.task1.Ammunition;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MotorcycleHelmetTest {
    private final double EPS = 1e-9;
    private MotorcycleHelmet motorcycleHelmet;


    @Before
    public void createNewMotocycleBoots() {
        motorcycleHelmet = new MotorcycleHelmet("Helm", "Shoei Neotec", 10, 30,
                "Polyurethane", "Plastic");
    }

    @Test
    public void name_ShouldBeEquals() {
        Assert.assertEquals("Helm", motorcycleHelmet.getName());
    }

    @Test
    public void manufacturer_ShouldBeEquals() {
        Assert.assertEquals("Shoei Neotec", motorcycleHelmet.getManufacturer());
    }

    @Test
    public void price_ShouldBeEquals() {
        Assert.assertEquals(10, motorcycleHelmet.getPrice(), EPS);
    }

    @Test
    public void weight_ShouldBeEquals() {
        Assert.assertEquals(30, motorcycleHelmet.getWeight(), EPS);
    }

    @Test
    public void price_ShouldBePositive() {
        Assert.assertTrue(motorcycleHelmet.isPricePositive());
    }

    @Test
    public void weight_ShouldBePositive() {
        Assert.assertTrue(motorcycleHelmet.isWeightPositive());
    }

    @Test
    public void eyeProtectionMaterial_ShouldBeEquals() {
        Assert.assertEquals("Polyurethane", motorcycleHelmet.getEyeProtectionMaterial());
    }

    @Test
    public void material_ShouldBeEquals() {
        Assert.assertEquals("Plastic", motorcycleHelmet.getHelmMaterial());
    }

}