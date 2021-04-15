import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Weight: ");
        double weight = input.nextDouble();
        System.out.print("ENter Your Height: ");
        double height = input.nextDouble();
        double bmi = weight / (height *height);
        System.out.println("Your Body Mass is : " + bmi + " in kg/m2");
        input.close();
    }
}
