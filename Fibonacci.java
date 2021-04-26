import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num1=0, num2=1, num3=0;
        for (int i = 0; i < 20; i++){
            if (i == 0) {
                System.out.print(i);
            }
            else if (i == 1) {
                System.out.print(" , " + i);
            }
            else{
                num3 = num1 + num2;
                System.out.print(" , " + num3);
                num1 = num2;
                num2 = num3;
            }
        }
        num1++;
        num2++;
    }
}
