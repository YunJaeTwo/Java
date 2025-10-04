package lecture7;

public class Car {
    String carName;
    static int carCount;

    public Car(String carName) {
        this.carName = carName;
        System.out.println(this.carName + "가 출고되었습니다.");
        carCount++;
    }

    static void showTotalCars() {
        System.out.println(carCount);
    }
    
}

