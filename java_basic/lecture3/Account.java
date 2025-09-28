package java_basic.lecture3;

public class Account {
    int balance = 0;

    void deposit(int money){
        balance += money;
        System.out.println(money + "원을 입금하였습니다.");
    }

    void withdraw(int money){
        System.out.println(money + "원의 출금을 시도합니다.");
        if(this.balance >= money){
            balance -= money;
            System.out.println(money + "원을 성공적으로 출금하였습니다.");
        }
        else
            System.out.println("잔액이 부족합니다.");
    }

    void status(){
        System.out.println("현재 계좌의 잔액은" + this.balance + "원 남았습니다.");
    }
}