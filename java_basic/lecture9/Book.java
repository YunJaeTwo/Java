package lecture9;

public class Book extends Item {
    String author;
    String isbn;

    protected Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    void print(){
        System.out.println("이름: " + this.name + "가격: " + this.price);
        System.out.println("- 저자 " +  this.author + "ISBN: " + this.isbn);
    }
}
