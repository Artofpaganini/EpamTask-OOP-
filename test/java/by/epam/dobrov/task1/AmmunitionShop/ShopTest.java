package by.epam.dobrov.task1.AmmunitionShop;

import by.epam.dobrov.task1.Ammunition.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ShopTest {


    private Shop shop;

    @Before
    public void createNewShop() {

        List<MotorcycleHelmet> motorcycleHelmets = new ArrayList<>();
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "Shoei Neotec", 10, 30, "Polyurethane", "Plastic"));
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "Shark Evo", 2220, 20, "Polyurethane", "Plastic"));

        List<MotorcycleGloves> motorcycleGloves = new ArrayList<>();
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "Acerbis", 10, 10, "S", "Cotton"));
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "AFX North America Inc.", 2320, 220, "M", "Cotton"));

        List<MotorcycleJacket> motorcycleJackets = new ArrayList<>();
        motorcycleJackets.add(new MotorcycleJacket("Jacket", "AFX North America Inc.", 10, 110, "S", "Red", "Skin"));
        motorcycleJackets.add(new MotorcycleJacket("Jacket", "Alpinestars", 20, 20, "M", "Blue", "Skin"));

        List<MotorcycleTrousers> motorcycleTrousers = new ArrayList<>();
        motorcycleTrousers.add(new MotorcycleTrousers("Trousers", "Alpinestars", 10, 120, "S", "Red", "Skin"));
        motorcycleTrousers.add(new MotorcycleTrousers("Trousers", " AGV ", 20, 202, "M", "Blue", "Skin"));

        List<MotorcycleBoots> motorcycleBoots = new ArrayList<>();
        motorcycleBoots.add(new MotorcycleBoots("Boots", " AGV", 10, 20, 42, "Zipper", "Red"));
        motorcycleBoots.add(new MotorcycleBoots("Boots", "AFX North America Inc.", 20, 30, 43, "Rivet fastener", "Blue"));

        shop = new Shop(motorcycleHelmets, motorcycleGloves, motorcycleJackets, motorcycleTrousers, motorcycleBoots);

    }

    @Test
    public void helmList_ShouldNotBeEqualsNullOrFalse() {

        List<MotorcycleHelmet> motorcycleHelmetListTest = new ArrayList<>();
        motorcycleHelmetListTest.add(new MotorcycleHelmet("Helm", "Shoei Neotec", 10, 30, "Polyurethane", "Plastic"));
        motorcycleHelmetListTest.add(new MotorcycleHelmet("Helm", "Shark Evo", 2220, 20, "Polyurethane", "Plastic"));

    }

    @Test
    public void glovesList_ShouldNotBeEqualsNullFalse() {

        List<MotorcycleGloves> motorcycleGlovesListTest = new ArrayList<>();
        motorcycleGlovesListTest.add(new MotorcycleGloves("Gloves", "Acerbis", 10, 10, "S", "Cotton"));
        motorcycleGlovesListTest.add(new MotorcycleGloves("Gloves", "AFX North America Inc.", 2320, 220, "M", "Cotton"));

        Assert.assertNotEquals(motorcycleGlovesListTest, shop.getMotorcycleGlovesList());

        Assert.assertNotNull(shop.getMotorcycleGlovesList());

        Assert.assertFalse(shop.getMotorcycleGlovesList().isEmpty());

    }

    @Test
    public void jacketList_ShouldNotBeEqualsNullFalse() {

        List<MotorcycleJacket> motorcycleJacketsListTest = new ArrayList<>();
        motorcycleJacketsListTest.add(new MotorcycleJacket("Jacket", "AFX North America Inc.", 10, 110, "S", "Red", "Skin"));
        motorcycleJacketsListTest.add(new MotorcycleJacket("Jacket", "Alpinestars", 20, 20, "M", "Blue", "Skin"));

        Assert.assertNotEquals(motorcycleJacketsListTest, shop.getMotorcycleJacketList());

        Assert.assertNotNull(shop.getMotorcycleJacketList());

        Assert.assertFalse(shop.getMotorcycleJacketList().isEmpty());

    }

    @Test
    public void trousersList_ShouldNotBeEqualsNullFalse() {

        List<MotorcycleTrousers> motorcycleTrousersListTest = new ArrayList<>();
        motorcycleTrousersListTest.add(new MotorcycleTrousers("Trousers", "Alpinestars", 10, 120, "S", "Red", "Skin"));
        motorcycleTrousersListTest.add(new MotorcycleTrousers("Trousers", " AGV ", 20, 202, "M", "Blue", "Skin"));

        Assert.assertNotEquals(motorcycleTrousersListTest, shop.getMotorcycleTrousersList());

        Assert.assertNotNull(shop.getMotorcycleTrousersList());

        Assert.assertFalse(shop.getMotorcycleTrousersList().isEmpty());

    }

    @Test
    public void bootsList_ShouldNotBeEqualsNullFalse() {

        List<MotorcycleBoots> motorcycleBootsListTest = new ArrayList<>();
        motorcycleBootsListTest.add(new MotorcycleBoots("Boots", " AGV", 10, 20, 42, "Zipper", "Red"));
        motorcycleBootsListTest.add(new MotorcycleBoots("Boots", "AFX North America Inc.", 20, 30, 43, "Rivet fastener", "Blue"));

        Assert.assertNotEquals(motorcycleBootsListTest, shop.getMotorcycleBootsList());

        Assert.assertNotNull(shop.getMotorcycleBootsList());

        Assert.assertFalse(shop.getMotorcycleBootsList().isEmpty());

    }

}