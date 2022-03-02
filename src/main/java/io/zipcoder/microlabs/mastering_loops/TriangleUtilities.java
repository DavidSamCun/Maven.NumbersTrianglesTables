package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getRow(int numberOfRows) {        //

        String star = "";
        for( int i = 1; i <= numberOfRows; i= i+1){
            star+= "*";
        }


        return star;
    }

    public static String getTriangle(int numberOfStars) {

        String star ="";

        for(int i =1; i <= numberOfStars; i++) {
            star+= getRow(i) + "\n";
        }

        return star;
    }

    public static String getSmallTriangle(int numberOfStars) {
        return getTriangle(numberOfStars);
    }

    public static String getLargeTriangle(int numberOfStars) {
        return getTriangle(numberOfStars);
    }
}
