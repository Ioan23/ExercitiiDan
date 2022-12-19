import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Salut Dan");
        List<Integer> numbers = Arrays.asList( 3, 5, 2, 8483, 111,
                321, 322, 543, 123,47,
                53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109,
                113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191,
                193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271);


                int primeNr = FifthExercise.displayPrimeNumbers(numbers);
       for(int i = 0; i == primeNr; i++)
            System.out.println("");
        }

    }


