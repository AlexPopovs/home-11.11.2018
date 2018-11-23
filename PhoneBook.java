//package lv.sdacademy.lesson1;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//
//public class PhoneBook {
//
//    public static void main(String[] args) {
//        List<Entry> entries = new ArrayList<>(); //LIST contains objects instead of primitives like in massives;
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Hello user!");
//        System.out.println("What you want to do?");
//        System.out.println("Options: ");
//        System.out.println("1 - add phone book entry");
//        System.out.println("2 - search");
//        System.out.println("0 - exit");
//        int optionSelected = in.nextInt();
//
//        switch (optionSelected) {
//            case 1: {
//                // adding new entry to phone book
//                Entry newEntry = new Entry();
//                System.out.println("Enter first name: ");
//                newEntry.setFirstName(in.next());
//                System.out.println("Enter last name: ");
//                newEntry.setLastName(in.next());
//                System.out.println("Enter phone number");
//                newEntry.setPhone(in.next());
//                entries.add(newEntry);
//            }
//            case 2: {
//                //search
//                System.out.println("Type search query:");
//                String query = in.next();
//                int totalResultCount = 0;
//                for (Entry entry: entries) {
//                    String entryAsText = (entry.getFirstName() + " " + entry.getLastName() + " " + entry.getPhone());
//                    if (entryAsText.contains(query)){
//                        System.out.println(entryAsText);
//                        totalResultCount++;
//                    }
//                }
//                System.out.println("Found " + totalResultCount + "results!");
//                break;
//            }
//
//
//        if (optionSelected == 1) {
//            while (true) {
//            Entry newEntry = new Entry();
//            System.out.println("Enter first name: ");
//            newEntry.setFirstName(in.next());
//            System.out.println("Enter last name: ");
//            newEntry.setLastName(in.next());
//            System.out.println("Enter phone number");
//            newEntry.setPhone(in.next());
//            entries.add(newEntry);
//
//            //exit or continue?
//                System.out.println("What you want to do next?");
//                System.out.println("Options: ");
//                System.out.println("1 - add phone book entry");
//                System.out.println("0 - exit");
//                optionSelected = in.nextInt();
//                if (optionSelected == 0) {
//                    break;
//                }
//                }
//            }
//        }
//    }
//}
//class Entry {
//    private String firstName;
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    private String lastName;
//    private String phone;
//
//}