package lecture9;

public class Item {
    protected String name;
    protected int price;

    protected Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void print() {
        System.out.println("이름: " + name + "가격: " + price);
    }

    int getPrice() {
        return price;    
    }
}
