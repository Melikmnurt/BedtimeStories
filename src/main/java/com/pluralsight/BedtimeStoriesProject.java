package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStoriesProject {
    public static void main(String[] args) {

        //Create a Scanner to read what the user types
        Scanner input = new Scanner(System.in);

        //Ask the user for the file name
        System.out.print("Enter the name of a story: ");
        String storyName = input.nextLine(); //Store the file name

        try {
            //Open the file from the resources folder
            FileReader fileReader = new FileReader("src/main/resources/" + storyName);

            //Use bufferedReader to read the file line by line
            BufferedReader bufreader = new BufferedReader(fileReader);

            int n = 1;

            while (true) {
                String line = bufreader.readLine();

                //Stop when the end of the file is reached
                if (line == null) {
                    break;
                }
                //Print the line number and the text
                System.out.println(n + ". " + line);

                n++;    //Increment line number
            }
            //Close the file
            bufreader.close();

        } catch (Exception e) {
            System.out.println("Can't find file");
        }
        // Close the scanner
        input.close();
    }
}