package java_basic.lecture6.path1;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        if(name == null || price <= 0 ||  quantity <= 0) {
            System.out.println("상품이름과 가격, 수량을 모두 입력해주세요!");
        }
        else {
            this.name = name;
            this.price = price;
            this.quantity =quantity;
        }
    }

    void itemDetail() {
        System.out.println("상품명: " + this.name + "합계: " + (this.price * this.quantity) + "원");
    }
}
