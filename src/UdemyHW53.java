import java.util.ArrayList;
import java.util.List;

// Array List

public class UdemyHW53 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);
        //retrieving
        System.out.println(numbers.get(0));

        System.out.println("/nIteration #1: ");
        //indexed for loop interation
        for(int i=0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("/nIteration #2: ");
        for(Integer value: numbers) {
            System.out.println(value);
        }

        //removing items (careful!)
        numbers.remove(numbers.size() -1);

        //this is very slow
        numbers.remove(0);

        System.out.println("/nIteration #2: ");
        for(Integer value: numbers) {
            System.out.println(value);
        }

        // List interface . . .
        List<String>values = new ArrayList<String>();




    }
}
