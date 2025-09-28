package java_basic.lecture4;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("컴퓨터구조", "백정엽 교수님");
        book2.displayInfo();

        Book book3 = new Book("프로그래밍 언어론", "박은지 교수님", 800);
        book3.displayInfo();
    }
}
