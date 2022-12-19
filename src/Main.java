import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int total = 0;
        System.out.println("Salut!");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(7);
        numbers.add(8);
        numbers.add(6);
        numbers.add(7);
        numbers.add(5);
        numbers.add(9);
        numbers.add(10);

        for (int number : numbers) {
            total += number;
        }
        // calculate the average
        double average = (double) total / numbers.size();
        System.out.println("The general average of "+ numbers.size()+ " notes is: " + average);
    }
    }
