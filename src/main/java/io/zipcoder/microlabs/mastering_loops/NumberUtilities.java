package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String output = "";

        for(int i = start; i < stop; i++){
            if( i%2 ==0){
                output += i;
            }
        }

        System.out.println(output);
        return output;

    }   //Done

    public static String getOddNumbers(int start, int stop) {

        String output = "";

        for(int i = start; i < stop; i++){
            if( i%2 !=0){
                output += i;
            }

        }

        System.out.println(output);
        return output;

    }  //Done


    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int stop) {
        return NumberUtilities.getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return NumberUtilities.getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        String output = "";

        for ( int i = start; i < stop; i = i + step){
            output += i;
        }
        return output;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        long square;
        String output = "";

        for(int i = start; i < stop; i = i + step){
            square = Math.round(Math.pow(i, exponent));
            output += String.valueOf(square);
            System.out.println(output);
        }

        return output;
    }
}
