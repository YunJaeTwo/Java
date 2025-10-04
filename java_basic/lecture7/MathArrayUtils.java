package lecture7;

public class MathArrayUtils {

    static int sum(int[] values) {
        int sum = 0;
        for(int i : values) {
            sum += i;
        }
        return sum;
    }

    static int average(int[] values) {
        int sum = sum(values);
        int len = values.length;
        int average = sum/len;

        return average;
    }

    static int min(int[] values) {
        int min = 100000;
        for(int i : values) {
            if(min > i) {
                min = i;
            }
        }
        return min;
    }

    static int max(int[] values) {
        int max = 0;
        for(int i : values) {
            if(max < i) {
                max = i;
            }
        }
        return max;
    }
}
