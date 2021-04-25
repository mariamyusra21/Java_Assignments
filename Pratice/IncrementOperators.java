package Pratice;

public class IncrementOperators {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        System.out.println("X and Y are: " + x + " and " + y);
        
        x++;
        System.out.println("X++ result is: " + x);

        ++x;
        System.out.println("++X result is: " + x);

        System.out.println("Resetting X value back to 0...");
        x = 0;
        System.out.println("---------------------------");


        y = x++;
        System.out.println("Y = X++ (Postfix) reults in:");
        System.out.println("X is: " + x);
        System.out.println("Y is: " + y);
        System.out.println("---------------------------");
        
        y = ++x;
        System.out.println("Y = X++ (Prefix) reults in:");
        System.out.println("X is: " + x);
        System.out.println("Y is: " + y);
        System.out.println("---------------------------");


    }
}
