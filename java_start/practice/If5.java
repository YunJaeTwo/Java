package java_start.practice;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args){
        int cost,age;
        Scanner sc = new Scanner(System.in);
        System.out.println("가격을 입력해주세요");
        cost = sc.nextInt();
        System.out.println("나이를 입력해주세요.");
        age = sc.nextInt();

        if(cost >= 10000) {
            System.out.println("10000원 이상 구매하셔서 1000원 할인되었습니다");
            cost -= 1000;
        }
        if(age <= 10) {
            if(cost > 1000) {
                System.out.println("10살 이하인 고객님들은 1000원 할인해드립니다.");
                cost -= 1000;
            }
        }   
        System.out.println("총 가격은"+ cost+"입니다");
    }
}
