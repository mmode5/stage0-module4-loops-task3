package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        long currentNumber = 0;

        int i = 1;
        while (i <= lengthOfLastNumber) {
            currentNumber = currentNumber * 10 + 9;
            sum += currentNumber;
            i++;
        }

        System.out.println(sum);
    }
}
