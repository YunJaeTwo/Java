package java_basic.lecture3;

public class Rectangle {
    int width;
    int height;
    int area;
    int perimeter;

    void assign(int width, int height){
        this.width = width;
        this.height = height;
    }

    int rectangleArea(){
        int area = this.width * this.height;
        System.out.println(area);
        return area;
    }

    int rectanglePerimeter(){
        int perimeter = 2*(this.width + this.height);
        System.out.println(perimeter);
        return perimeter;
    }

    void isSquare(){
        if(this.width == this.height){
            System.out.println("정사각형입니다.");
        }
        else
            System.out.println("정사각형이 아닙니다.");
    }
}
