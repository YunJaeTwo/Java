package java_start.practice;

import java.util.Scanner;

public class OperationEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score;
        System.out.println("정수를 입력해주세요");
        score = sc.nextInt();

        if (80 <= score && score <= 100) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


    }
}
