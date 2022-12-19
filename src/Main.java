import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // First exercise
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8483,111,321,322,543,123);
        int firstEvenNumber = FirstExercise.findFirstEvenNumber(numbers);
        if (firstEvenNumber == -1) {
            System.out.println("No even numbers found in the list.");
        } else {
            System.out.println("The first even number in the list is: " + firstEvenNumber);
        }
    }
}







