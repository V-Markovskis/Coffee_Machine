class ManufacturingController {

    public static int count = 0;

    public static String requestProduct(String product) {
        count++;
        return count + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        return count;
    }
}