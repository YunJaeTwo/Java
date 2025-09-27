package lecture1;


public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] menu = new ProductOrder[3];

        ProductOrder dubu = new ProductOrder();
        dubu.productMain = "두부";
        dubu.price = 1500;
        dubu.quantity = 30;
        menu[0] = dubu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productMain = "김치";
        kimchi.price = 18000;
        kimchi.quantity = 40;
        menu[1] = kimchi;

        ProductOrder coke = new ProductOrder();
        coke.productMain = "콜라";
        coke.price = 1900;
        coke.quantity = 450;
        menu[2] = coke;

        int totalprice = 0;

        System.out.println("안녕하세요. 좋은 쇼핑하시라고 메뉴 안내드립니다.");
        for(ProductOrder i : menu){
            System.out.println("이 제품은 " +i.productMain+ "입니다.");
            System.out.println("가격은 " + i.price + "원이고 " + "수량은 " + i.quantity + "개 남았습니다.");
            totalprice += i.price;
        }

        System.out.println("하나씩 구매하시면 "+totalprice+"원 되겠습니다.");
    }
}
