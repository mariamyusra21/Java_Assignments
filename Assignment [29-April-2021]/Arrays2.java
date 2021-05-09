import java.util.Arrays;

public class Arrays2 {
    
    static int[] reverseArray(int[] array){          // reverseArray is a function which takes Array as input and returns reverse of Array
        int[] reverseArray = new int[array.length];
        int i = array.length-1;

        for (int j : array) {
            reverseArray[i] = j;
            i--;
        }
        return reverseArray;
    }


    public static void main(String[] args) {
        int[] myArray = {7, 8, 9};
        int[] rArray = reverseArray(myArray);
        System.out.println("The Reverse order of " + Arrays.toString(myArray) + " is " + Arrays.toString(rArray));
    }
}
