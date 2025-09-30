package java_basic.lecture6.path1;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max){ //초기값 설정
        this.max = max;
    }

    public void increment() { //1 더하기
        if(this.count >= this.max) {
            System.out.println("최댓값을 초과할 수 없습니다.");
        }
        else {
            this.count += 1;
            System.out.println("1을 추가했습니다.");
        }
    }

    public int getCounter(){ //값 출력
        return this.count;
    }
}
