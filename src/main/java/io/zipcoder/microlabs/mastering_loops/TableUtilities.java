package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable(int n) {

        return TableUtilities.getMultiplicationTable(n);

    }

    public static String getLargeMultiplicationTable(int n) {
        return TableUtilities.getMultiplicationTable(n);
    }

    public static String getMultiplicationTable(int n) {


        return printTable(n);

    }

    public static String printRow(int size, int column){

        String output = "";
        int i = 1;
        while (i <= column){
            //System.out.printf("  %4d|", size * i);
            if (i == column) {
                output += String.format("%3d |\n",size * i);
            }//Had a \n after 4d|
            else {
                output += String.format("%3d |",size * i);
            }
            i++;
        }
        System.out.println();
        return output;
    }

    public static String printTable(int size){

        String output = "";
        int i = 1;
        while (i <= size ) {
            output += printRow(i , size);
            i++;
        }
        return output;
    }

    //DEMO from Dolio

/*    public class avg(int... values){
        int sum = 0;
        for(int value : values){
            sum += value;
        }
        return sum/values.length;
        doStuff("I", "Do", "a", "thing"}*/

    public static void doStuff(String... vars){
        for (String val: vars)
        {
            System.out.println(val);
        }

    }
}
