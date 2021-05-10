import java.util.Arrays;

public class Arrays3 {
    static int[] addArrays(int[] array1, int[] array2){
        int[] array3 = new int[array1.length + array2.length];
        //int j = array3.length;

        //Traversing each element of array1 into array3...
        for (int i = 0;i<array1.length;i++) {
            array3[i] = array1[i];
        }

        //Traversing each element of array2 into array3...
        for (int j = 0;j < array2.length;j++) {
            array3[array1.length + j] = array2[j];
        }

        return array3;
    }

    public static void main(String[] args) {
        int[] myArray1 = {4,5,6};
        int[] myArray2 = {7,8,9};

        System.out.println("The Concatenation of " + Arrays.toString(myArray1) +" and " + Arrays.toString(myArray2) + " is:");
        int[] myArray3 = addArrays(myArray1, myArray2);
        System.out.println(Arrays.toString(myArray3));

    }
}
