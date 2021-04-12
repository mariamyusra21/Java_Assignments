import java.util.Scanner;
public class SwapVariable {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num1 , num2;
        System.out.println("For Swapping the Variables you should give the integer data to the Variables...");
        System.out.print("Enter your Data for first Variable: ");
        num1 = number.nextInt();
        System.out.print("Enter your Data for second Variable: ");
        num2 = number.nextInt();
        System.out.println("Your data for first Variable is:" + num1);
        System.out.println("Your data for second Variable is:" + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Now the data of Variables are changed...");
        System.out.println("The data of your first Variable has been changed to" + num1);
        System.out.println("The data of your second Variable has been changed to" + num2);

        number.close();
    }
}
