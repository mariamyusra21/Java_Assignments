import java.util.Scanner;
import java.lang.Math;
public class QuadraticEq {
    public static void main(String[] args) {
        double a_variable, b_variable, c_constant;
        double answer;
        Scanner input_variable = new Scanner(System.in);
        System.out.print("Enter the following requirements to solve a Quadratic Equation...");
        System.out.print("Enter the Co-efficient of your squaring variable: ");
        a_variable = input_variable.nextDouble();
        System.out.print("Enter the Co-efficient of your x variable: ");
        b_variable = input_variable.nextDouble();
        System.out.print("Enter the value for the constant variable: ");
        c_constant = input_variable.nextDouble();
        answer = b_variable *b_variable -4.0 * a_variable *c_constant;

        if (answer > 0.0) {
            double ans1 = (-b_variable + Math.pow(answer, 0.5)) / (2.0 * a_variable);
            double ans2 = (-b_variable - Math.pow(answer,0.5)) / (2.0 * a_variable);
            System.out.println("The roots are " + ans1 + " and " + ans2);
        }
        else if (answer == 0.0) {
            double ans1 = -b / (2.0 * a_variable);
            System.out.println("The root is " + ans1);
        }
        else {
            System.out.println("The equation has no real roots.");
        }

        input_variable.close();
    }
}
