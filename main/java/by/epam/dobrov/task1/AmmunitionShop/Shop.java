package by.epam.dobrov.task1.AmmunitionShop;

/**
 * Определить иерархию амуниции. Экипировать мотоциклиста. Посчитать стоимость.
 * Провести сортировку амуниции на основе веса. Найти элементы амуниции, соответствующие заданному диапазону параметров цены.
 */

import by.epam.dobrov.task1.Ammunition.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Shop {

    private final static Logger logger = LoggerFactory.getLogger(Shop.class);

    private List<MotorcycleHelmet> motorcycleHelmetList;
    private List<MotorcycleGloves> motorcycleGlovesList;
    private List<MotorcycleJacket> motorcycleJacketList;
    private List<MotorcycleTrousers> motorcycleTrousersList;
    private List<MotorcycleBoots> motorcycleBootsList;

    public Shop(List<MotorcycleHelmet> motorcycleHelmetList, List<MotorcycleGloves> motorcycleGlovesList, List<MotorcycleJacket> motorcycleJacketList,
                List<MotorcycleTrousers> motorcycleTrousersList, List<MotorcycleBoots> motorcycleBootsList) {

        logger.info("Shop filled  by each  types of ammunitions");
        this.motorcycleHelmetList = motorcycleHelmetList;
        this.motorcycleGlovesList = motorcycleGlovesList;
        this.motorcycleJacketList = motorcycleJacketList;
        this.motorcycleTrousersList = motorcycleTrousersList;
        this.motorcycleBootsList = motorcycleBootsList;

    }

    public List<MotorcycleHelmet> getMotorcycleHelmetList() {
        return motorcycleHelmetList;
    }

    public List<MotorcycleGloves> getMotorcycleGlovesList() {
        return motorcycleGlovesList;
    }

    public List<MotorcycleJacket> getMotorcycleJacketList() {
        return motorcycleJacketList;
    }

    public List<MotorcycleTrousers> getMotorcycleTrousersList() {
        return motorcycleTrousersList;
    }

    public List<MotorcycleBoots> getMotorcycleBootsList() {
        return motorcycleBootsList;
    }


    @Override
    public String toString() {
        return "Shop: " +
                "motorcycleHelmetList=" + motorcycleHelmetList + "\n" +
                " motorcycleGlovesList=" + motorcycleGlovesList + "\n" +
                " motorcycleJacketList=" + motorcycleJacketList + "\n" +
                " motorcycleTrousersList=" + motorcycleTrousersList + "\n" +
                " motorcycleBootsList=" + motorcycleBootsList;
    }
}
