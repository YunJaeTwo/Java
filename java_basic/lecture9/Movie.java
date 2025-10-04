package lecture9;

public class Movie extends Item {
    String director;
    String actor;

    protected Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }
    
    @Override
    void print(){
        System.out.println("이름: " + this.name + "가격: " + this.price);
        System.out.println("- 감독 " +  this.director + "배우: " + this.actor);
    }
}
