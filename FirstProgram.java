import java.util.Scanner;

public class FirstProgram {
    public static void main (String[] args){
        System.out.println("Hello, This is an Addition program of two numbers...");
        Scanner numInput = new Scanner(System.in);

        //int FirstNumber, SecondNumber, Sum;
        //int sum;

        System.out.println("Enter the first number...");
        int FirstNumber = numInput.nextInt();
        System.out.println("Enter the second number...");
        int SecondNumber = numInput.nextInt();
        int Sum = FirstNumber + SecondNumber;
        System.out.print("The Sum of these two numbers are: ");
        System.out.print(Sum);
        
    }
}
