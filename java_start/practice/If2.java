package java_start.practice;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;

        System.out.println("please insert your age");
        age = sc.nextInt();

        if(age >= 18) {
            System.out.println("성인입니다.");
        }
        else {
            System.out.println("미성년자입니다.");
        }
    }
}
