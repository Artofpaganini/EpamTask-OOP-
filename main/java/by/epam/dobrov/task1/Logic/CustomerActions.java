package by.epam.dobrov.task1.Logic;

import by.epam.dobrov.task1.Ammunition.MotorcycleAmmunition;
import by.epam.dobrov.task1.AmmunitionShop.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 1.	Определить иерархию амуниции. Экипировать мотоциклиста. Посчитать стоимость.
 *  Провести сортировку амуниции на основе веса. Найти элементы амуниции, соответствующие заданному диапазону параметров цены.
 */
public class CustomerActions {

    private final static Logger logger = LoggerFactory.getLogger(CustomerActions.class);

    private Customer customer;
    private double price;

    public CustomerActions(Customer customer) {
        this.customer = customer;
    }

    public double calculateCosts(List<? extends MotorcycleAmmunition> list) {

        logger.info("Calculated costs for  list type of ammunition ");
        double sum = 0;

        for (MotorcycleAmmunition i : list) {
            sum += i.getPrice();
        }
        return sum;
    }

    public double getPrice() {
        logger.info("The total cost of the kit chosen");

        double price = calculateCosts(customer.getMotorcycleHelmetList()) + calculateCosts(customer.getMotorcycleJacketList()) +
                calculateCosts(customer.getMotorcycleGlovesList()) + calculateCosts(customer.getMotorcycleTrousersList()) +
                calculateCosts(customer.getMotorcycleBootsList());

        return price;

    }

}
