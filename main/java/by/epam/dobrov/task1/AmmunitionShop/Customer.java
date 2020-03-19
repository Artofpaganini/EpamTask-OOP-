package by.epam.dobrov.task1.AmmunitionShop;

/**
 * 1.	Определить иерархию амуниции. Экипировать мотоциклиста. Посчитать стоимость.
 * Провести сортировку амуниции на основе веса. Найти элементы амуниции, соответствующие заданному диапазону параметров цены.
 */

import by.epam.dobrov.task1.Ammunition.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Customer {

    private final static Logger logger = LoggerFactory.getLogger(Customer.class);


    private List<MotorcycleHelmet> motorcycleHelmetList;
    private List<MotorcycleGloves> motorcycleGlovesList;
    private List<MotorcycleJacket> motorcycleJacketList;
    private List<MotorcycleTrousers> motorcycleTrousersList;
    private List<MotorcycleBoots> motorcycleBootsList;

    public Customer(List<MotorcycleHelmet> motorcycleHelmetList, List<MotorcycleGloves> motorcycleGlovesList, List<MotorcycleJacket> motorcycleJacketList,
                    List<MotorcycleTrousers> motorcycleTrousersList, List<MotorcycleBoots> motorcycleBootsList) {

        logger.info("Customer chosen 1 or more each type of items and assign this  items on this  list ");
        this.motorcycleHelmetList = motorcycleHelmetList;
        this.motorcycleGlovesList = motorcycleGlovesList;
        this.motorcycleJacketList = motorcycleJacketList;
        this.motorcycleTrousersList = motorcycleTrousersList;
        this.motorcycleBootsList = motorcycleBootsList;

    }

    public List<MotorcycleHelmet> getMotorcycleHelmetList() {
        return motorcycleHelmetList;
    }

    public void setMotorcycleHelmetList(List<MotorcycleHelmet> motorcycleHelmetList) {
        this.motorcycleHelmetList = motorcycleHelmetList;
    }

    public List<MotorcycleGloves> getMotorcycleGlovesList() {
        return motorcycleGlovesList;
    }

    public void setMotorcycleGlovesList(List<MotorcycleGloves> motorcycleGlovesList) {
        this.motorcycleGlovesList = motorcycleGlovesList;
    }

    public List<MotorcycleJacket> getMotorcycleJacketList() {
        return motorcycleJacketList;
    }

    public void setMotorcycleJacketList(List<MotorcycleJacket> motorcycleJacketList) {
        this.motorcycleJacketList = motorcycleJacketList;
    }

    public List<MotorcycleTrousers> getMotorcycleTrousersList() {
        return motorcycleTrousersList;
    }

    public void setMotorcycleTrousersList(List<MotorcycleTrousers> motorcycleTrousersList) {
        this.motorcycleTrousersList = motorcycleTrousersList;
    }

    public List<MotorcycleBoots> getMotorcycleBootsList() {
        return motorcycleBootsList;
    }

    public void setMotorcycleBootsList(List<MotorcycleBoots> motorcycleBootsList) {
        this.motorcycleBootsList = motorcycleBootsList;
    }

    @Override
    public String toString() {
        return "Customer сhoise: " + "\n" +
                motorcycleHelmetList + "\n" +
                motorcycleGlovesList + "\n" +
                motorcycleJacketList + "\n" +
                motorcycleTrousersList + "\n" +
                motorcycleBootsList;
    }
}
