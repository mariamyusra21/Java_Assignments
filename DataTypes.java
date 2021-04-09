import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        Scanner numInput = new Scanner (System.in);

        // Integer Example...
        System.out.println("Enter the Requirements of Addition of Integers...");
        System.out.println("Enter the first number...");
        int FirstNumber = numInput.nextInt();
        System.out.println("Enter the second number...");
        int SecondNumber = numInput.nextInt();
        int Sum = FirstNumber + SecondNumber;
        System.out.print("The Sum of these two numbers are: ");
        System.out.println(Sum);
        
        // Float Example...
        System.out.println("Enter the Requirements of Multiplication of Float Numbers...");
        System.out.println("Enter the first number...");
        float Number1 = numInput.nextFloat();
        System.out.println("Enter the second number...");
        float Number2 = numInput.nextFloat();
        float Result = Number1 * Number2;
        System.out.print("The Multiplication of these two numbers are: ");
        System.out.println(Result);

        // String Example...
        System.out.println("Enter your Favourite Slogan...");
        String Slogan = numInput.next();
        System.out.println(Slogan);
    }
}
