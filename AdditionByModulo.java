import java.util.Scanner;
public class AdditionByModulo{
    public static void main(String[] args) {
        Scannner numInput = new Scanner(System.in);
        System.out.print("Enter your Numbers in the range of 1000: ");
        int number = numInput.nextInt();
        System.out.println(getSumOfDigit(number));

    }
}

class Modulus_Addition{
    
    void getSumOfDigit(int number){
        int sum = 0;
        int i;
        while (number > 0)
        {
            i = number % 10;
            sum = sum + i;
            number = number / 10;
        }
        return sum;
    }

}