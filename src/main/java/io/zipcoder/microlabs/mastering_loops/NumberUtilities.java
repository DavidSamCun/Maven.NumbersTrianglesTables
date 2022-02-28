package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        int arraylength = stop - start + 1;
        int[] array = new int[stop+5];
        String output = "";

        //build array
        for(int i = start; i <= stop; i++){
            array[i] = i;
            System.out.println(array[i]);
        }


        //check array
        for (int i = start; i <= stop; i++ )
        if (array[i]%2 == 0){
            output += String.valueOf(array[i]);
            System.out.println(output);
        }
        return output;
    }


    public static String getOddNumbers(int start, int stop) {

        int arraylength = stop - start + 1;
        int[] array = new int[stop+5];
        String output = "";

        //build array
        for(int i = start; i <= stop; i++){
            array[i] = i;
            System.out.println(array[i]);
        }


        //check array
        for (int i = start; i <= stop; i++ )
            if (array[i]%2 == 1){
                output += String.valueOf(array[i]);
                System.out.println(output);
            }
        return output;

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
