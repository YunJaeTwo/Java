package java_basic.lecture6.path2;

import java_basic.lecture6.path1.MaxCounter;

public class MaxCounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCounter();
        System.out.println(count);
    }
}
