package java_start.practice;

import java.util.Scanner;

public class EvenOddEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력하세요.");
        int number = sc.nextInt();

        String num = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println(num+"입니다.");
    }
}
