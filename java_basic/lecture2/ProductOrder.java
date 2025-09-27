package lecture2;

public class ProductOrder {
    String productName;
    int price;
    int quantity;

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;
        return product;
    }

    public static void printOrder(ProductOrder[] order){
        for(ProductOrder i : order){
            System.out.print(i.productName + " ");
            System.out.print(i.price + "원 ");
            System.out.println(i.quantity + "개");
        }
    }

    public static int getTotalAmount(ProductOrder[] order){
        int total = 0;
        for(ProductOrder i : order){
            total += i.price;
        }
        return total;
    }
}

