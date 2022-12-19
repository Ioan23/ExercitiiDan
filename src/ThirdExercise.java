
// Exercitiul 3
// Afiseaza numarul cel mai mic dintr-o lista

import java.util.List;

public class ThirdExercise {

    public static int findLowestNumber (List<Integer> numbersList) throws IllegalAccessException {

        // check if the list is empty
        if(numbersList.size()==0){
            throw new IllegalAccessException("the list must not be empty");
        }


        // set the lowest nr for the first element from list
        int lowestNr = numbersList.get(0);


        // compare every number with the lowest number
        for(int i = 1; i< numbersList.size();i++)
        {
            // take every number from list and compare it with the lowest
            int current = numbersList.get(i);
            if(current< lowestNr){

                //update the lowest nr
                lowestNr = current;
            }
        }
        return lowestNr;

    }
}
