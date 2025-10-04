package lecture9;

public class Album extends Item {
    String artist;

    protected Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    void print(){
        System.out.println("이름: " + this.name + "가격: " + this.price);
        System.out.println("- 아티스트: " +  this.artist);
    }

    
}
