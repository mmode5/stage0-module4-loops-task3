package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
       int length = Integer.toString(Math.abs(t)).length();
       int sum = 0;
       int num = Math.abs(t);

       for(int i = 0; i < length; i++){
           int tempNum = num % 10;
           sum += tempNum;
           num = (num -tempNum) /10;
       }

           System.out.println(sum);

    }
}
