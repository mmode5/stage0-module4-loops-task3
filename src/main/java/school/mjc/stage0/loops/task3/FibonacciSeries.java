package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first  = 0;
        int second  =1;
        if(lastFibonacci == 0) System.out.println(first);
        if(lastFibonacci == 1) System.out.println(second);
        int sum = first + second;
        if(lastFibonacci > 2){
            System.out.println(first);
            System.out.println(second);
        }
        for(int i = 2; i < lastFibonacci; i++){
            System.out.println(sum);
            int tempValue = sum;
            sum += second;
            second = tempValue;
        }
    }
}
