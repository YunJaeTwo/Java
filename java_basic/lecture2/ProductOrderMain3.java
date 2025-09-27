package lecture2;
import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주문할 물품의 개수를 입력해주세요! :");
        int num = sc.nextInt();

        ProductOrder[] orders = new ProductOrder[num];

        for(int i = 0; i < num; i++){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.println("상품명 :");
            String productName = sc.next();

            System.out.println("가격 :");
            int price = sc.nextInt();

            System.out.println("수량 :");
            int quantity = sc.nextInt();

            ProductOrder order = ProductOrder.createOrder(productName, price, quantity);
            orders[i] = order;
        }
        ProductOrder.printOrder(orders);
        int total = ProductOrder.getTotalAmount(orders);
        System.out.println(total);
    }
}