package Assignment1;
public class Assignment1 {

    public static void main(String[] args){
        int n = 100000;
        long starttime, endtime, exectime;

        starttime = System.nanoTime();
        for(int i=1; i < n; i++)
        }

        endtime = System.nanoTime();
        exectime = endtime - starttime;

        System.out.println("Execution Time in nano seconds =" + (double)(exectime/n));
}
}