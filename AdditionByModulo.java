import java.util.Scanner;
public class AdditionByModulo{
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        System.out.print("Enter your Numbers in the range of 1000: ");
        int number = numInput.nextInt();
        System.out.println(Modulus_Addition.getSumOfDigit(number));

        numInput.close();
    }
}

class Modulus_Addition{
    
    int getSumOfDigit(int n){
        int sum = 0;
        int i;
       while (n > 0)
        {
            i = n % 10;
            sum = sum + i;
            n = n / 10;
        }
        return sum;
    }

}
