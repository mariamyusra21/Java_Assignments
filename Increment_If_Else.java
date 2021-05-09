import java.util.Scanner;

public class Increment_If_Else {
    public static void main(String[] args) {
        float salary;
        int exp;
        String fullName;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Full Name: ");
        fullName = input.nextLine();

        System.out.print("Enter your Experience: ");
        exp = input.nextInt();
        
        System.out.print("Enter your Salary: ");
        salary = input.nextFloat();

        
        if (exp >= 30) {
            System.out.println(fullName + ", as your experience is " + exp + ". Your Appraisal will be " + (int) (salary * 1.3));
        }
        
        else if (exp >= 20) {
            System.out.println(fullName + ", as your experience is " + exp + ". Your Appraisal will be " + (int) (salary * 1.2));
        }

        else if (exp >= 10) {
            System.out.println(fullName + ", as your experience is " + exp + ". Your Appraisal will be " + (int) (salary * 1.15));
        }

        else{
            System.out.println(fullName + " as per Policy of the Company, you will not get any Appraisal this year...");
        }

        input.close();
    }
}
