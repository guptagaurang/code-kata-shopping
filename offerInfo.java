//Class to store the key values as the selected items for the bulk purchase and the relevant price to it.
import java.util.TreeMap;

public class offerInfo {

    public static TreeMap<String, productInfo> productList = new TreeMap<>();

    static {
        productList.put("A",new productInfo("A",130.0,3));
        productList.put("B", new productInfo("B", 37.0, 2));
    }
}
