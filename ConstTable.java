import java.util.Scanner;
public class ConstTable
{
    public static void main(String[] args) {
        Scanner scanValue = new Scanner(System.in);
        System.out.print("Enter the value of Height of Table 1... ");
        int height1 = scanValue.nextInt();
        System.out.print("Enter the value of Width of Table 1... ");
        int width1 = scanValue.nextInt();
        System.out.print("Enter the value of Height of Table 2... ");
        int height2 = scanValue.nextInt();
        System.out.print("Enter the value of Width of Table 2... ");
        int width2 = scanValue.nextInt();
        // creating object of constructor...
        Table tb1 = new Table(width1, height1);
        Table tb2 = new Table(width2, height2);
        // Printing the Values of Table by Contructor and objects...
        System.out.println("The Height of the Table 1 is: " + tb1.getHeight() + "The width of the Table 1 is: " + tb1.getWidth() );
        System.out.println("The Height of the Table 2 is: " + tb2.getHeight() + "The width of the Table 2 is: " + tb2.getWidth() );
    
        // Sum of the Heights and Widths of Tables...
        System.out.println("The Sum of Heights of both the Tables is: " + (tb1.getHeight() + tb2.getHeight()));
        System.out.println("The Sum of Widths of both the Tables is: " + (tb1.getWidth() + tb2.getWidth()));
        scanValue.close();
    }
}
class Table{
    int height;
    int width;

    public Table(int w, int h){
        width= w;
        height = h;
    }

    int getHeight(){
        return height;
    }

    int getWidth(){
        return width;
    }

}