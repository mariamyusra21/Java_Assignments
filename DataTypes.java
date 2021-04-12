import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        Scanner numInput = new Scanner (System.in);

        // Integer Example...
        System.out.println("Enter the Requirements of Addition of Integers...");
        System.out.println("Enter the first number...");
        int firstNumber = numInput.nextInt();
        System.out.println("Enter the second number...");
        int secondNumber = numInput.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.print("The Sum of these two numbers are: ");
        System.out.println(sum);
        
        // Float Example...
        System.out.println("Enter the Requirements of Multiplication of Float Numbers...");
        System.out.println("Enter the first number...");
        float number1 = numInput.nextFloat();
        System.out.println("Enter the second number...");
        float number2 = numInput.nextFloat();
        float result = number1 * number2;
        System.out.print("The Multiplication of these two numbers are: ");
        System.out.println(result);

        // String Example...
        System.out.println("Enter your Favourite Slogan...");
        String slogan = numInput.nextLine();
        System.out.println(slogan);

        // Double Example...
        System.out.println("Enter the Requirements for Arithmetic Mean of Double Numbers...");
        System.out.println("Enter the first number...");
        double first = numInput.nextDouble();
        System.out.println("Enter the second number...");
        double second = numInput.nextDouble();
        double answer = (first + second)/2.0;
        System.out.print("The Arithmetic Mean of these two numbers are: ");
        System.out.println(answer);

        //Boolean Example...
        System.out.println("Photons have capability to lose energy. [True/False]");
        boolean ans = numInput.nextBoolean();
        System.out.print(ans);
 
        numInput.close();
    }
}
