import java.util.Scanner;

// 10. Getting User Input
import java.util.Scanner;

public class UdemyHW10 {
    public static void main(String[] args) {
        

        // Create scanner object 
        Scanner input = new Scanner(System.in);
       
        // Output the prompt
        System.out.println("Enter a floating point value: ");
       
        // Wait for thr user to enter a line of text
        double value = input.nextDouble();
       
        // Tell them what they entered
        System.out.println("You entered: " + value);
    }
}

