public class Main {
    public static void main(String[] args) {
<<<<<<< Updated upstream
        System.out.println("Hello world!");
=======


        // First exercise
        List<Integer> numbers = Arrays.asList(1, 3, 5, 3,8483, 111, 321, 322, 543, 123);
//        int firstEvenNumber = FirstExercise.findFirstEvenNumber(numbers);
//        if (firstEvenNumber == -1) {
//            System.out.println("No even numbers found in the list.");
//        } else {
//            System.out.println("The first even number in the list is: " + firstEvenNumber);
//        }


        // Second Exercise

        int firstDivisible7nr = SecondExercise.firstDivisibleNr7(numbers);
        if (firstDivisible7nr == -1) {
            System.out.println("No divizible numbers found in the list.");
        } else {
            System.out.println("The first divizible number with 7 from the list is: " + firstDivisible7nr);
        }
>>>>>>> Stashed changes
    }
}