package lv.sdacademy.lesson1;

import java.time.Month;
import java.util.Scanner;

public class DailyLifeAlgorithm {
    public static void main(String[] args) {

        Scanner ui = new Scanner (System.in);

        System.out.println("What month is now?");
        String Months = ui.next();
        if (Months.equals("November")) {
            System.out.println("Please change your car's tyres to winter tires");
        } else if (Months.equals("April")) {
            System.out.println("Please change your car's tyres to summer tires");
        } else {
            System.out.println("You are good to go");
        }
        }
    }
