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

    // Bubble Sort of the Array...
    static int[] sortArray(int[] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++) {                 // Outer Loop
            int ptr = 0;
            while (ptr < n-i-1) {                       // Inner Loop
                if (array[ptr] > array[ptr + 1]) {
                    int temp = array[ptr];
                    array[ptr] = array[ptr + 1];
                    array[ptr + 1] = temp;
                }
                ptr++;
            }
        }

        return array;
    }


    public static void main(String[] args) {
        int[] myArray1 = {2,4,6,8,10};
        int[] myArray2 = {1,3,5,7,9};

        System.out.println("The Concatenation of " + Arrays.toString(myArray1) +" and " + Arrays.toString(myArray2) + " is:");
        int[] myArray3 = addArrays(myArray1, myArray2);
        System.out.println(Arrays.toString(myArray3));
        int[] sortedArray = sortArray(myArray3);
        System.out.println("Bubble sort of the Array is " + Arrays.toString(sortedArray));

    }
}
