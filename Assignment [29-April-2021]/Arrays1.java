import java.util.Arrays;

class Arrays1{
    // Using static modifier not to use the object for calling in the main method...
    static float getSum(float[] array){
        float sum = 0.0f;
        for (float i : array) {
            sum += i;
        }
        return sum;
    }

    // Another static method...
    static float getAverage(float[] array){
        return (getSum(array)/array.length);
    }

    static float getStandardDeviation(float[] array){
        float mean = getAverage(array);
        float summation = 0.0f;

        for (float x : array) {
            summation += Math.pow(x - mean, 2);                 // x is the iterable value of the array...
        }

        float temp = summation / (array.length-1);
        float standardDeviation = (float) Math.sqrt(temp);
        return standardDeviation;
    }


    public static void main(String[] args) {
        // Hard initialization of the Array...
        float[] myArray = {2, 4, 6, 8, 10};
        
        // Calling static method (without making the object)
        float sum = getSum(myArray);
        System.out.println("Sum of " + Arrays.toString(myArray) + " is " + sum);
        System.out.println();

        float average = getAverage(myArray);
        System.out.println("Average of " + Arrays.toString(myArray) + " is " + average);
        System.out.println();
  
        float sDeviation = getStandardDeviation(myArray);
        System.out.println("Standard Deviation of " + Arrays.toString(myArray) + " is " + sDeviation);
        System.out.println();


    }
}