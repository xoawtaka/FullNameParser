package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameParserApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name (First, Middle, Last: )");
        String FullName = input.nextLine().trim();

        String[] names = FullName.split("\\s+");

        //declaring first and last name
        String firstName = names[0];
        String lastName = names[names.length - 1];

        //taking in all middle names
        //concatinating all middle names


        String middleNames = String.join(" ", Arrays.copyOfRange(names, 1, names.length - 2));


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
        System.out.println("Middle Name: " + middleNames);
        System.out.println("Last Name: " + lastName);

        input.close();
        /*
        fullNameParsed()
        */
    }
}
    /*
    //create method for name parsing
    public static fullNameParsed(String[] args) {
    */


