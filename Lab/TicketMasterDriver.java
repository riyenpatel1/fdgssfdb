package U7.Lab;

import U6.TriviaLab.Question;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster shows = new TicketMaster();
        System.out.println("\tDate\t|\tPrice\t|\tQty\t|\tPerformer\t|\tCity");
        System.out.println("============================================================");
        shows.readShow();
        System.out.println(shows);
    }

    public static int getUserChoice(Scanner input) {
        /*
           ask the user for their choice
           use try block to read their choice
           If the choice is an int, then make sure its in the right range
           If its not an int, and goes to the catch, then give user a message
           Return this value
         */
        return 0;
    }
}
