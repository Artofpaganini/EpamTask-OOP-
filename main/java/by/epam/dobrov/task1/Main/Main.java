package by.epam.dobrov.task1.Main;

import by.epam.dobrov.task1.Ammunition.*;
import by.epam.dobrov.task1.AmmunitionShop.Customer;
import by.epam.dobrov.task1.AmmunitionShop.Shop;
import by.epam.dobrov.task1.Logic.ActionWithAmmunition;
import by.epam.dobrov.task1.Logic.CustomerActions;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.	Определить иерархию амуниции. Экипировать мотоциклиста. Посчитать стоимость.
 * Провести сортировку амуниции на основе веса. Найти элементы амуниции, соответствующие заданному диапазону параметров цены.
 */

public class Main {
    public static void main(String[] args) {

        /**
         * shop has  lists  of each type of motorcycle ammunitions
         */
        Shop shop = new Shop(helmetsList(), glovesList(), jacketList(), trousersList(), bootsList());

        /**
         * ActionWithAmmunitions -  logic
         */
        ActionWithAmmunition actionWithAmmunition = new ActionWithAmmunition(shop);

        /**
         * show each ammunition-list
         * made  choice positions from  list , and assign  in the Buff-list
         */
        actionWithAmmunition.showItemsInfo(helmetsList());
        List<MotorcycleHelmet> helmet = (List<MotorcycleHelmet>) (actionWithAmmunition.selectAmmunition(shop.getMotorcycleHelmetList()));

        actionWithAmmunition.showItemsInfo(jacketList());
        List<MotorcycleJacket> jacket = (List<MotorcycleJacket>) (actionWithAmmunition.selectAmmunition(shop.getMotorcycleJacketList()));

        actionWithAmmunition.showItemsInfo(glovesList());
        List<MotorcycleGloves> gloves = ((List<MotorcycleGloves>) (actionWithAmmunition.selectAmmunition(shop.getMotorcycleGlovesList())));

        actionWithAmmunition.showItemsInfo(trousersList());
        List<MotorcycleTrousers> trousers = ((List<MotorcycleTrousers>) (actionWithAmmunition.selectAmmunition(shop.getMotorcycleTrousersList())));

        actionWithAmmunition.showItemsInfo(bootsList());
        List<MotorcycleBoots> boots = ((List<MotorcycleBoots>) (actionWithAmmunition.selectAmmunition(shop.getMotorcycleBootsList())));


        /**
         * assign buff-list, in the customers  lists
         */
        Customer customer = new Customer(helmet, gloves, jacket, trousers, boots);
        System.out.println(customer.toString());

        /**
         * total price for the complete,which customer  choose
         */
        CustomerActions customerActions = new CustomerActions(customer);
        System.out.println("The total cost of the kit chosen by the client:" + customerActions.getPrice() + "\n");


        /**
         * sorted each list of Ammunitions  in the shop, by weight
         */
        actionWithAmmunition.sortByWeight(shop.getMotorcycleHelmetList());
        actionWithAmmunition.sortByWeight(shop.getMotorcycleJacketList());
        actionWithAmmunition.sortByWeight(shop.getMotorcycleGlovesList());
        actionWithAmmunition.sortByWeight(shop.getMotorcycleTrousersList());
        actionWithAmmunition.sortByWeight(shop.getMotorcycleBootsList());

        actionWithAmmunition.showItemsInfo(shop.getMotorcycleHelmetList());
        actionWithAmmunition.showItemsInfo(shop.getMotorcycleJacketList());
        actionWithAmmunition.showItemsInfo(shop.getMotorcycleGlovesList());
        actionWithAmmunition.showItemsInfo(shop.getMotorcycleTrousersList());
        actionWithAmmunition.showItemsInfo(shop.getMotorcycleBootsList());

        /**
         * finding and showing items , which are in the range  price(btw min/max prices)
         */
        actionWithAmmunition.findAndShowItemsInRangePrice(helmetsList());
        actionWithAmmunition.findAndShowItemsInRangePrice(jacketList());
        actionWithAmmunition.findAndShowItemsInRangePrice(glovesList());
        actionWithAmmunition.findAndShowItemsInRangePrice(trousersList());
        actionWithAmmunition.findAndShowItemsInRangePrice(bootsList());

    }

    /**
     * Additional info,  in this  methods we are  creating  each  type  of  ammunition list
     */
    public static List<MotorcycleHelmet> helmetsList() {

        List<MotorcycleHelmet> motorcycleHelmets = new ArrayList<>();
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "Shoei Neotec", 10, 30, "Polyurethane", "Plastic"));
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "Shark Evo", 2220, 20, "Polyurethane", "Plastic"));
        motorcycleHelmets.add(new MotorcycleHelmet("Helm", "HJC", 30, 10, "Glass", "Plastic"));

        return motorcycleHelmets;
    }

    public static List<MotorcycleGloves> glovesList() {

        List<MotorcycleGloves> motorcycleGloves = new ArrayList<>();
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "Acerbis", 10, 10, "S", "Cotton"));
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "AFX North America Inc.", 2320, 220, "M", "Cotton"));
        motorcycleGloves.add(new MotorcycleGloves("Gloves", "Alpinestars", 30, 30, "L", "Cotton"));

        return motorcycleGloves;
    }

    public static List<MotorcycleJacket> jacketList() {

        List<MotorcycleJacket> motorcycleJackets = new ArrayList<>();
        motorcycleJackets.add(new MotorcycleJacket("Jacket", "AFX North America Inc.", 10, 110, "S", "Red", "Skin"));
        motorcycleJackets.add(new MotorcycleJacket("Jacket", "Alpinestars", 20, 20, "M", "Blue", "Skin"));
        motorcycleJackets.add(new MotorcycleJacket("Jacket", "AGV", 30, 30, "L", "Yellow", "Skin"));

        return motorcycleJackets;
    }

    public static List<MotorcycleTrousers> trousersList() {

        List<MotorcycleTrousers> motorcycleTrousers = new ArrayList<>();
        motorcycleTrousers.add(new MotorcycleTrousers("Trousers", "Alpinestars", 10, 120, "S", "Red", "Skin"));
        motorcycleTrousers.add(new MotorcycleTrousers("Trousers", " AGV ", 20, 202, "M", "Blue", "Skin"));
        motorcycleTrousers.add(new MotorcycleTrousers("Trousers", "AFX North America Inc.", 20, 30, "L", "Yellow", "Skin"));

        return motorcycleTrousers;
    }

    public static List<MotorcycleBoots> bootsList() {

        List<MotorcycleBoots> motorcycleBoots = new ArrayList<>();
        motorcycleBoots.add(new MotorcycleBoots("Boots", " AGV", 10, 20, 42, "Zipper", "Red"));
        motorcycleBoots.add(new MotorcycleBoots("Boots", "AFX North America Inc.", 20, 30, 43, "Rivet fastener", "Blue"));
        motorcycleBoots.add(new MotorcycleBoots("Boots", "Answer Racing", 30, 30, 44, "Zipper", "Yellow"));

        return motorcycleBoots;
    }


}
