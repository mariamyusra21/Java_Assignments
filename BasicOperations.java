import java.util.Scanner;
import java.lang.Math;
public class BasicOperations {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter your first number...");
        int num1 = numInput.nextInt();
        System.out.println("Enter your second number...");
        int num2 = numInput.nextInt();

        // Sum of the numbers user has given as in input...
        System.out.println("The Sum of the numbers you have given is: " + Math.addExact(num1, num2));
       
       // Difference of the numbers user has given as in input...
       System.out.println("The Difference of the numbers you have given is: " + Math.subtractExact(num1, num2)); 
       
       // Product of the numbers user has given as in input...
       System.out.println("The Product of the numbers you have given is: " + Math.multiplyExact(num1, num2));

       // Average of the numbers user has given as in input...
       System.out.println("The Average of the number you have given is: " + ((num1 + num2)/2));

       // Disttance between the numbers user has given as in input...
       System.out.println("The distance between the numbers you have given is: " + (num1 - num2));

       // Maximum number from the input...
       System.out.println("The Maximum number among the input you have given is: " + Math.max(num1, num2));

       // Minimum number from the input...
       System.out.println("The Minimum number among the input you have given is: " + Math.min(num1, num2));
       numInput.close();
    }
}
