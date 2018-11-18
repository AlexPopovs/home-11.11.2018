package lv.sdacademy.lesson1;

// Implement number search in array

import java.util.Scanner;

public class NumberSearchArray {
    public static void main(String[] args) {

        int[] myData = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner in = new Scanner(System.in);
        int numberThatYouSearch = in.nextInt();

        boolean isNumberFound = false;

        for (int i = 0; i < myData.length; i++) {
            if (myData[i] == numberThatYouSearch) {
                isNumberFound = true;
                System.out.println("I found the number as a " + (i + 1) + "nd/rd/th element");
            }
        }

        if (!isNumberFound) {
            System.out.println("Number was not found in this array");
        }
    }
}
