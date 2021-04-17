import java.util.Scanner;
public class AdditionByModulo{
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        System.out.print("Enter your Numbers in the range of 1000: ");
        int number = numScan.nextInt();
        // Function SumOfDigitsOfNumber calls by reference of class ModulusAddition
       // System.out.println(ModulusAddition.SumOfDigitsOfNumber(number));

        AdditionOfDigitsOfInput obj = new AdditionOfDigitsOfInput();
        System.out.println("The Sum of the Digits are: " + obj.SumOfDigitsOfNumber(number));

        numScan.close();
    }
}

class AdditionOfDigitsOfInput{
    
    //static int getSumOfDigit(int n){
     int SumOfDigitsOfNumber(int num){
        int sum = 0;
        int rem;
       while (num > 0)
        {
            rem = n % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }

}
