package Assignment2;

public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0, 0.0, 0.0);
        Circle c3 = new Circle(1.0, 1.0, 1.0);
        
        if (c2.equal(c3))
            System.out.println("two circles are equal.");
        else
            System.out.println("two circles are different");

        if (c2.compare(c3) > 0.0)
            System.out.println("the first is larger than the second.");
        else if (c2.compare(c3) < 0.0)
            System.out.println("the first is smaller than the second.");
        else
            System.out.println("two are the same in area.");

        c2.print();
        c2.resize(2.0);
        c2.print();

    }
}
