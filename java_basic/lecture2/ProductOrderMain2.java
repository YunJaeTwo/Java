package lecture2;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder order1 = ProductOrder.createOrder("김치", 15000, 30);
        ProductOrder order2 = ProductOrder.createOrder("두부", 1000, 50);
        ProductOrder order3 = ProductOrder.createOrder("김치찌개", 10000, 20);
        ProductOrder order4 = ProductOrder.createOrder("김치전", 150000, 10);

        ProductOrder[] orders = new ProductOrder[4];

        orders[0] = order1;
        orders[1] = order2;
        orders[2] = order3;
        orders[3] = order4;

        ProductOrder.printOrder(orders);
        int total = ProductOrder.getTotalAmount(orders);

        System.out.println(total);


    }
}
