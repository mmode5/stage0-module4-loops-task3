package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int minValue = Math.min(first, second);
        int maxValue = Math.max(first, second);
        if(minValue == 0) System.out.println(maxValue);;
        if(minValue!= 0) {
            for (int i = minValue; i > 1; i--) {
                if (maxValue % i == 0 && minValue % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
