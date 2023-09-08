package sol;

import src.Item;
import src.FuncList;
import src.IFuncList;

/**
 * Class representing a shopping cart of Items
 */
public class Cart {
    /**
     * Field representing the list of Items
     */
    private IFuncList<Item> items;

    /**
     * Constructor for a Cart
     *
     * @param items     the list of items in the cart
     */
    public Cart(IFuncList<Item> items) {
        this.items = items;
    }

    /**
     * Method to compute the total cost of items in the cart, including discounts
     * Rules are:
     *  - If the total cost of shoes in the cart is at least $100, take 20% off the cost of shoes
     *  - If there are at least two hats in the cart, take $10 off the entire order (after shoes discount)
     *  - The cart total cannot be less than 0
     *  - All Items in the cart will have costs greater than 0
     *
     * @return  the total cost including discounts
     */
    public double checkout() {
        // TODO: fill out this method!
        return 0.0;
    }
}
