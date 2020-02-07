public class checkoutScan {

    public static void main(String[] args) {
        checkoutMethods scan = new checkoutMethods();

        scan.viewCart();
        scan.addProduct("B", 1);
        System.out.println("This is the first cart view");
        scan.viewCart();
        scan.addProduct("B", 1);
        System.out.println("This is the Second cart view");
        scan.viewCart();
        scan.addProduct("B", 1);
        System.out.println("This is the Third cart view");
        scan.viewCart();
        scan.addProduct("B", 1);
        System.out.println("This is the Fourth cart view");
        scan.viewCart();

        double totalPrice = scan.calculateTotal(scan.productListMap);
        System.out.println("Total Price: " + totalPrice);

    }

}
