//This class is to store the price of all the products indivually using the key functionality of the TreeMap

import java.util.TreeMap;

public class productPrice {


    public static TreeMap<String,Double> eachProductPrice = new TreeMap<>();
    static {

        eachProductPrice.put("A",50.0);
        eachProductPrice.put("B",30.0);
        eachProductPrice.put("C",20.0);
        eachProductPrice.put("D",10.0);

    }



}
