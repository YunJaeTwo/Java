package java_start.practice;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int age;
        age = sc.nextInt();

        if(age <= 7) {
            System.out.print("미취학");
        }
        else if(age <= 13) {
            System.out.print("초등학생");
        }
        else if(age <= 16) {
            System.out.print("중학생");
        }
        else if(age <= 19) {
            System.out.print("고등학생");
        }
        else {
            System.out.print("성인");
        }
        System.out.println("입니다");
    }
}
