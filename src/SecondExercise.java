
// Exercitiul 2
// Afiseaza primul numar dint-o lista care e divizibil cu 7

import java.util.List;

public class SecondExercise {

    public static int firstDivisibleNr7(List<Integer> numbers){
        for (int nr: numbers)
        {
            if(nr%7==0){
                return nr;
            }


        }



return -1;
    }
}
