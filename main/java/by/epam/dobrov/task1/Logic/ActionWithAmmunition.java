package by.epam.dobrov.task1.Logic;
/**
 * 1.	Определить иерархию амуниции. Экипировать мотоциклиста. Посчитать стоимость.
 * Провести сортировку амуниции на основе веса. Найти элементы амуниции, соответствующие заданному диапазону параметров цены.
 */

import by.epam.dobrov.task1.Ammunition.MotorcycleAmmunition;
import by.epam.dobrov.task1.AmmunitionShop.Customer;
import by.epam.dobrov.task1.AmmunitionShop.Shop;
import by.epam.dobrov.task1.Comparator.ClassComparator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;


public class ActionWithAmmunition {

    private static final Logger logger = LoggerFactory.getLogger(ActionWithAmmunition.class);
    /**
     * Shop  has   each type of  list-ammunitions
     */
    private Shop shop;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Customer selected  items and  assign  each , in  the own list
     */
    private Customer customer; // подумать

    public ActionWithAmmunition(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }

    /**
     * method  show on console all information about element's in  list
     *
     * @param list
     */
    public void showItemsInfo(List<? extends MotorcycleAmmunition> list) {

        for (MotorcycleAmmunition motorcycleAmmunitions : list) {
            System.out.println(motorcycleAmmunitions);
        }
    }

    /**
     * Verification ,  method is  checking , is  input list  empty or not
     *
     * @param list
     * @return boolean info
     */
    public boolean isAmmunitionListNotEmpty(List<? extends MotorcycleAmmunition> list) {

        if (list.size() > 0) {

            return true;
        }

        return false;
    }


    /**
     * Method get  value, from keyboard input,  check  this value,
     * and if  value didn't pass verification, show  system  message,
     * and  repeat cycle.
     *
     * @param message, system message
     * @return value, which matches the validation pattern   on  input index
     */
    public String inputIndexValue(String message) {

        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();

        while (!(isInputIndexValidationTrue(value))) {
            System.out.println(message);
            value = sc.nextLine();
        }

        return value;
    }

    /**
     * Method with  pattern  of validation on input index
     *
     * @param value , which  we  got from  method  inputIndexValue
     * @return boolean info
     */
    public boolean isInputIndexValidationTrue(String value) {

        if (value.matches("^-?[0-9]+$")) {
            return true;
        }
        return false;
    }

    /**
     * If input index  pass verify and matches the validation pattern
     * This is  general method for the parse Integer(Only)
     * Method parsed this value  in Integer
     *
     * @param value
     * @return int number
     */
    public int parseValue(String value) {

        int number = Integer.parseInt(value);

        return number;
    }


    /**
     * Method get value, from keyboard input,  check  this value,
     * and if  value didn't pass verification, show  system  message,
     * and  repeat cycle.
     *
     * @param message
     * @return value, which matches the validation pattern on input Yes/No Value
     */
    public String inputYesNoValue(String message) {
        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();

        while (!(isYesNoValidationTrue(value))) {
            System.out.println(message);
            value = sc.nextLine();
        }

        return value;

    }

    /**
     * Method with  pattern  of validation on input yes/no
     *
     * @param value , which  we  got from  method  inputYesNoValue
     * @return boolean info
     */
    public boolean isYesNoValidationTrue(String value) {

        if (value.matches("^(0|1)$")) {
            return true;
        }
        return false;
    }

    /**
     * Method is  checking,   is number(input index)  be in range  of list size or not
     *
     * @param number , which we  got  from  method InputIndexValue
     * @param list   , list  it's general, for each types of ammunition
     * @return boolean info
     */
    public boolean isInputIndexNumberBeInRangeListSize(int number, List<? extends MotorcycleAmmunition> list) {

        if (number < list.size() && number >= 0) {
            return true;
        }
        return false;
    }

    /**
     * Negative method , needs,because if  customer  don't  want  to   choose  any  items
     * and  to continue choisen with the next list ,  input index  must be  "-1"
     *
     * @param number , which we  got  from  method InputIndexValue
     * @return boolean info
     */
    public boolean isDenial(int number) {
        int cancel = -1;

        if (number == cancel) {
            return true;
        } else if (number < cancel) {
            return false;
        }
        return false;
    }

    /**
     * Attachment  method , if customer  want's  to add  more than  1 item,from  1 list ,
     * input value must be  "yes(0)"  or  if negative answer "no(1)";
     *
     * @param number , which we  got  from  method inputYesNoValue
     * @return boolean info
     */
    public boolean isYesOrNo(int number) {

        int yes = 0;
        int no = 1;

        if (number == yes) {
            return true;
        } else if (number == no) {
            return false;
        }
        return false;
    }

    /**
     * Method, created Buff-list( for the filling), and each time it asks for parameters shop- list(which class extends from MotorcycleAmmunition)
     * Method realisation:
     * 1)verification: is  input list  empty or not,
     * if yes - get "No items" and method will close;
     * if no  - get  to access for the choisen  items from shop-list
     * 2) after input index number, verification on a negative number( if "-1" method will close, if  another negative number
     * get  "Incorrect index number" , and ask  repeat input
     * 3) verification:  is number(input index)  be in range  of list size or not
     * if yes( in range) - continue chosen
     * if not - "Incorrect index number"
     * 4) add founding item in the Buff-list, and  ask  to add one more or not?
     * if yes - cycle  will repeat
     * if no - cycle  will close
     *
     * @param list ,which class extends from MotorcycleAmmunition
     * @return buff-list , which  we assing for the customer-list in future
     */
    public List<? extends MotorcycleAmmunition> selectAmmunition(List<? extends MotorcycleAmmunition> list) {

        logger.info("Created own items list/ started to choose  items which are necessary,from shoplist/ added this items  in own list");
        List<MotorcycleAmmunition> selectedItems = new ArrayList<>();

        /**
         * valid, needs for the infinity cycle, while  valid wouldn't be false;
         */
        boolean valid = true;

        if (isAmmunitionListNotEmpty(list)) {

            while (valid) {
                System.out.println("Please make you choice or input -1, if you don't need anything");
                int enterIndexNumber = parseValue(inputIndexValue("Please,try again, you should enter index number "));

                if (isDenial(enterIndexNumber)) {
                    logger.info("List isn't interesting ");
                    break;
                }
                if (isInputIndexNumberBeInRangeListSize(enterIndexNumber, list)) {
                    logger.info("Input indexNumber is in the range of list size ");

                    selectedItems.add(list.get(enterIndexNumber));
                    valid = false;
                    System.out.println("Do you want to choose more? - Yes(0)/No(1)");
                    int selectYesNo = parseValue(inputYesNoValue("Please,try again "));

                    if (isYesOrNo(selectYesNo)) {
                        logger.info("Customer want's get more items");
                        valid = true;

                    } else {
                        logger.warn("Customer finished own list with  this  type of items");
                        break;
                    }

                } else {
                    logger.warn("Input indexNumber is not in the range of list size(Incorrect index Number)");
                    System.out.println("Incorrect index number");
                }
            }

        } else {
            logger.warn("Shop list  is  empty");
            System.out.println("No items");
        }

        return selectedItems;
    }

    /**
     * Method , for the  sorted  each  items in  each list , by  weight
     *
     * @param list ,which class extends from MotorcycleAmmunition
     * @return sorted list
     */
    public List<? extends MotorcycleAmmunition> sortByWeight(List<? extends MotorcycleAmmunition> list) {
        logger.info("Sorted items of  each list, by weight");

        Comparator<MotorcycleAmmunition> comparator = new ClassComparator(); // нужно ли логгить в самом компараторе
        Collections.sort(list, comparator);

        return list;
    }

    /**
     * Method  for the input min/max value, check  this value,
     * and if  value didn't pass verification, show  system  message,
     * and  repeat cycle.
     *
     * @param message , system message
     * @return value, which pass verification
     */
    public String inputMaxMinValue(String message) {
        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();

        while (!(isMaxMinValidationTrue(value))) {
            System.out.println(message);
            value = sc.nextLine();
        }

        return value;

    }

    /**
     * Method with  pattern  of validation for min/max values
     *
     * @param value , which  will verify
     * @return boolean info
     */
    public boolean isMaxMinValidationTrue(String value) {

        if (value.matches("^[0-9]+\\.?[0-9]*$")) {
            return true;
        }
        return false;
    }

    /**
     * method  parse for min/max validation
     *
     * @param value , which  passed  verification
     * @return number, which parsed
     */
    public double parseMinOrMaxValues(String value) {

        double number = Double.parseDouble(value);

        return number;
    }

    /**
     * Method - test ,  checking is  min and  max values  are corrected, btw themselves
     *
     * @param minValue
     * @param maxValue
     * @return boolean info
     */
    public boolean isMinPriceAndMaxPriceHaveRightValues(double minValue, double maxValue) {

        if (minValue < maxValue && minValue > 0) { //
            return true;
        }
        return false;

    }

    /**
     * Method - test ,  checking is  itemPrice be  in  range, btw  min and  max price
     *
     * @param itemPrice
     * @param minValue
     * @param maxValue
     * @return boolean info
     */
    public boolean isItemPriceInRangeMinMaxPrice(double itemPrice, double minValue, double maxValue) {

        if (itemPrice >= minValue && itemPrice <= maxValue) {
            return true;
        }
        return false;
    }

    /**
     * Method , is finding and showing items , which are in the range  price(btw min/max prices)
     *
     * @param list ,which class extends from MotorcycleAmmunition
     */
    public void findAndShowItemsInRangePrice(List<? extends MotorcycleAmmunition> list) {
        logger.info("Set range price / find  items which prices  are in that range");
        boolean valid = true;

        double minPrice;
        double maxPrice;

        if (isAmmunitionListNotEmpty(list)) {
            logger.info("Verification was passed, list isn't  empty ");
            while (valid) {
                System.out.println("Please enter min/max price");

                minPrice = parseMinOrMaxValues(inputMaxMinValue("Wrong min value, Please, try again"));
                maxPrice = parseMinOrMaxValues(inputMaxMinValue("Wrong max value, Please, try again"));

                if (isMinPriceAndMaxPriceHaveRightValues(minPrice, maxPrice)) {
                    logger.info("Min/Max price verification was passed");

                    for (MotorcycleAmmunition motorcycleAmmunition : list) {

                        if (isItemPriceInRangeMinMaxPrice(motorcycleAmmunition.getPrice(), minPrice, maxPrice)) {
                            logger.info("Item price is  min/max price range ");
                            System.out.println(motorcycleAmmunition);
                            valid = false;
                        }
                    }
                    if (valid) {
                        logger.warn("Don't have items in this price range ");
                        System.out.println("Sorry, we don't have  items  in  this price range , please try again "); // тут?
                    }

                } else {
                    logger.warn("Min/Max price verification was not passed(Incorrect values)");
                    System.out.println("Sorry,incorrect values,  please try again ");
                }
            }
        } else {
            logger.trace("Verification didn't passed,Shop list  is  empty");
            System.out.println("No items");
        }
    }
}

