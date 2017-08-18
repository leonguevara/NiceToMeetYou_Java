/*
  This program will ask the user for their name and then it
  will greet them using their name.  The program uses character
  arrays to handle strings just for didactic purposes.

  Author: ISC León Felipe Guevara Chávez, MATI, MA
  Email:  leon.guevara@itesm.mx
  Date:   May 20, 2017
  Java:   SDK 1.8 - Language level 8
*/

package com.leonguevara;    // Interesting thing a package

import java.util.Scanner;   // We need this so we can use the Scanner for input.

public class Main {
    // Class variables (properly named attributes)
    static Scanner scanner = new Scanner(System.in);    // We initialize the scanner to use the
                                                        // standard system input

    public static void main(String[] args) {
        String message;                                 // The string to build the greeting message
        System.out.println("What is your name?");       // We ask for the user's name
        String userName = scanner.nextLine();           // We use the scanner to read the user's name

        // We build the greeting message
        message = "Hello " + userName + "! Nice to meet you.";

        System.out.println(message);                    // We display the greeting message
    }
}
