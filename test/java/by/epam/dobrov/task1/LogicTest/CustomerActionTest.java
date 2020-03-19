package by.epam.dobrov.task1.LogicTest;


import by.epam.dobrov.task1.Ammunition.MotorcycleGloves;
import by.epam.dobrov.task1.AmmunitionShop.Customer;
import by.epam.dobrov.task1.Logic.CustomerActions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomerActionTest {

    private final double EPS = 1e-9;
    private CustomerActions customerActions;
    private Customer customer;

    @Before
    public void createNewCustomerAction() {

        customerActions = new CustomerActions(customer);

    }

    @Test
    public void newCalculateCosts_ShouldBeEqualsSumOfAllPricesInList() {

        List<MotorcycleGloves> motorcycleGloves = new ArrayList<>();
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "Acerbis", 10, 10, "S", "Cotton"));
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "AFX North America Inc.", 2320, 220, "M", "Cotton"));
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "Alpinestars", 30, 30, "L", "Cotton"));

        Assert.assertEquals(2360, customerActions.calculateCosts(motorcycleGloves), EPS);

        Assert.assertNotEquals(2400, customerActions.calculateCosts(motorcycleGloves), EPS);
    }


    @After
    public void cleanNewCustomerAction() {
        customerActions = null;
    }


}