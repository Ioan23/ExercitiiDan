
// Exercitiul 5
// Afiseaza toate numerele prime dintr-o lista

import java.util.List;

public class FifthExercise {


    public static int displayPrimeNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
        return 0;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
