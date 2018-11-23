import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HomePhoneBook {
    public static void main(String[] args) {
        displayMenu();                                          // creating function
    }

    public static void callContact(String name) {                // creating next function
        System.out.println("Calling " + name);
    }

    public static void savePhoneNumber(String name, long number) {  // creating next function
        System.out.println("Saving contact " + name + ": " + number);

        try (PrintWriter pw = new PrintWriter(new FileWriter("base.txt", true))) { // here we created text file called "base";
            // append - "добавить", which means continue writing in this document with the next process initiation.
            pw.println(name + ": " + number);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

        public static void findNumber(String name) {                 // creating next function

            try (Scanner in = new Scanner(new File("base.txt"))) {
                String s[];
                boolean foundPerson = false;

                while (in.hasNextLine()) {
                    s = in.nextLine().split(":");
                    if (s[0].equals(name)) {
                        System.out.println("The number associated with " + name + " is " + s[1]);
                        foundPerson = true;
                    }
                }

                if (!foundPerson) {
                    System.out.println("Sorry, could not find " + name);

                }

            } catch (IOException e) {
            System.out.println(e.getMessage());
            }
        }


    public static void displayMenu() {
        try (Scanner in = new Scanner(System.in)) {

            String name;

            System.out.println("Hello Alex! \n What you want to do? (please use menu 1, 2, 3 or 4)");
            System.out.println("1. Call phone book");
            System.out.println("2. Save phone number");
            System.out.println("3. Find number");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nWho do you want to call? (Firstname Lastname)");
                    name = in.nextLine();
                    callContact(name);
                    break;

                case 2:
                    System.out.println("What is the name of the person you want to save? (Firstname Lastname");
                    name = in.nextLine();

                    System.out.println("What is the phone number of the person you would like to save? (number: 111222333");
                    long number = in.nextLong();
                    in.nextLine();

                    savePhoneNumber(name, number);
                    break;

                case 3:
                    System.out.println("Please enter name surname of the person you want to find");
                    findNumber(in.nextLine());
                    break;

                default:
                    break;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}