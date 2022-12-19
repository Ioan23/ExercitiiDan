
// Exercitiul 4
// Afiseaza numarul cel mai mare dintr-o lista

import java.util.List;

public class FourthExercise {

    public static int higherNumber(List<Integer> numbers){
        // setez primul numar din lista ca fiind cel mai mare
         int higherNr=  numbers.get(0);

         for(int i = 1; i < numbers.size();i++){
              int current = numbers.get(i);


              //daca numarul din lista e mai mare ca numarul mai mare setat il inlocuiesc cu numarul pe care l-am avut mai mare
              if (current> higherNr){

                  higherNr = current;
              }
         }
    return higherNr;
    }
}
