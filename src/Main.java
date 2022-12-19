import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//       1. Create a method that takes in a list of integers as a parameter.


//       2. Create a new list that will hold the sorted even numbers.
//       3. Iterate over the input list and add each even number to the new list.
//       4. Return the new list.


        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);
        List<Integer> evenNumbers = sortEvenNumbers(numbers);
        System.out.println(evenNumbers); // prints [2, 4, 6]


    }
        public static List<Integer> sortEvenNumbers(List<Integer> numbers) {
            List<Integer> evenNumbers = new ArrayList<>();
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                }
            }
            return evenNumbers;
        }
    }




