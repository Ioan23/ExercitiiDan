import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");


        List<Integer> numbers = List.of(16,7,14,18);

        int lowComMulti = 1;
        for (int i : numbers) {
            lowComMulti = mLowestCommonMultiple(lowComMulti, i);
        }

        System.out.println(lowComMulti);
    }

    // method to calculate the lowest common multiply for 2 numbers
    public static int mLowestCommonMultiple(int a, int b) {
        return a * b / greatestCommonDivisor(a, b);
    }

    // Method for find greatest common divisor for two numbers
    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);

    }
}