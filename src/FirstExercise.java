
// Exercitiul 1
// Afiseaza primul numar par dintr-o lista


import java.util.List;

public class FirstExercise {

    public static int findFirstEvenNumber(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                return number;
            }
        }
        return -1;
    }


}

