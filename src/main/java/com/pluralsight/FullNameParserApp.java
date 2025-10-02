package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameParserApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name (First, Middle, Last: )");
        String FullName = input.nextLine().trim();

        fullnameparsed(FullName);
        /*
        fullnameparsed("Lela Quyen Tran");

         */
    }

    public static void fullnameparsed(String name) {

        String[] names = name.split("\\s+");

        //declaring first and last name
        String firstName = names[0];
        String lastName = names[names.length - 1];

        //taking in all middle names
        //concatenating all middle names
        //if no middle name: first name and last name
        String middleNames = "";
        {
            if (names.length > 2) middleNames = String.join(" ",
                    Arrays.copyOfRange(names, 1, names.length - 1));
        }

        // initialize middle names in numerical order

        //last step: create return to 'fullnameparser' class specializing in parsing

        //separation of names without utilizing Case sense
        //utilizing regular expressions to delineate names via the white space in 'FullName' input
        //regex: " " — captures the white spaces and [0] captures the index of white spaces in 'FullName'

        //regular parsing split method
        /*
        String firstName = FullName.split(" ")[0].trim();
        String middleName = FullName.split(" ")[1].trim();
        String lastName = FullName.split(" ")[2].trim();
        */
    /*
        if middleName

     */
        //print each name
        System.out.println("First Name: " + firstName);
        if (!middleNames.isEmpty()) {
            for (int index = 1; index < names.length - 1; index++) {
                System.out.println("Middle Name(s) " + (index) + ": " + names[index]);
            }
        }
        System.out.println("Last Name: " + lastName);
    }
}



        /*
        fullNameParsed()
        */

    /*
    //create method for name parsing
    public static fullNameParsed(String[] args) {
    */


