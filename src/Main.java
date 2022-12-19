import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Salut Dan!");


        // First exercise
        List<Integer> numbers = Arrays.asList( 3, 5, 2, 8483, 111, 321, 322, 543, 123);
//        int firstEvenNumber = FirstExercise.findFirstEvenNumber(numbers);
//        if (firstEvenNumber == -1) {
//            System.out.println("No even numbers found in the list.");
//        } else {
//            System.out.println("The first even number in the list is: " + firstEvenNumber);
//        }


        // Second Exercise

//        int firstDivisible7nr = SecondExercise.firstDivisibleNr7(numbers);
//        if (firstDivisible7nr == -1) {
//            System.out.println("No divizible numbers found in the list.");
//        } else {
//            System.out.println("The first divizible number with 7 from the list is: " + firstDivisible7nr);
//        }


    // ThirdExercise

//        int lowerNr = ThirdExercise.findLowestNumber(numbers);
//        if (lowerNr == -1) {
//            System.out.println("No numbers found in the list.");
//        } else {
//            System.out.println("The lowest nr from list is: " + lowerNr);
//        }



        // FourthExercise

        int higherNR = FourthExercise.higherNumber(numbers);
        if(higherNR == -1){
            System.out.println("we don't have numbers in list");
        }
        else {
            System.out.println(" The higer number from list is: " + higherNR);
        }
}

}