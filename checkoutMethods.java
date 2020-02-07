/* This programme is for the shopping cart where the products are added
and for some selected products discount is provided for a bulk buy. The
programme uses the TreeMap to store the list of the products and other functionality.
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class checkoutMethods {

    public TreeMap<String, Integer> productListMap = new TreeMap();
    //Method to add the product to the TreeMap List
    public void addProduct(String product, int quantity) {

        if (productListMap.containsKey(product) == false)
            productListMap.put(product, quantity);
        else {
            productListMap.put(product, quantity + productListMap.get(product));
        }
    }

    //Method to view the items that are added to the cart
    public void viewCart() {
        if (productListMap.isEmpty()) {
            System.out.println("The Shopping Cart is Empty");

        } else {
            Set<String> productsInCart = productListMap.keySet();
            for (Iterator<String> i = productsInCart.iterator(); i.hasNext(); ) {
                String product = i.next();
                int quantity = productListMap.get(product);
                System.out.println("Product : " + product + " Quantity :" + quantity);
            }
        }
    }
    //Method to empty the cart
    public void emptyCart() {
        productListMap.clear();
    }
    // Method to get the total of all the products that are added to the cart
    // The method also calculates the price after discount is applied for the selected products.
    public double calculateTotal(TreeMap<String, Integer> productListMap) {
        double total = 0.0;
        Set<String> productsInCart = productListMap.keySet();
        for (Iterator<String> i = productsInCart.iterator(); i.hasNext(); ) { // loop to go through all the products that are added in the cart
            String product = i.next();
            int quantity = productListMap.get(product);

            if (offerInfo.productList.containsKey(product)) {
                productInfo productInfo = (productInfo) offerInfo.productList.get(product);

                if (productInfo.quantity < quantity) {
                    total += (quantity % productInfo.quantity) * productPrice.eachProductPrice.get(product) + (quantity / productInfo.quantity) * productInfo.price;
                } else if (productInfo.quantity == quantity) {
                    total += productInfo.price;
                } else {
                    total += (quantity) * productPrice.eachProductPrice.get(product);
                }
            } else {
                total += (quantity) * productPrice.eachProductPrice.get(product);
            }


        }
        return total; // returns the final total after the discount is applied as a bulk purchase
    }
}
