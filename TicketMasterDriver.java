package U7.Lab;

import U6.TriviaLab.Question;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Welcome to TicketMaster!\n");
        Scanner dataIn = new Scanner(System.in);
        getUserChoice(dataIn);
        //TicketMaster shows = new TicketMaster();
        //shows.readShow();
        //System.out.println(shows);

    }
    public static int getUserChoice(Scanner input) {
        String menu = "1) Sort by City\n2) Sort by Performer (A-Z)\n3) Sort by Performer (Z-A)\n" +
                "4) Sort by Price (Low-High)\n5) Sort by Price (High-Low)\n6) Quit\n\n";
        int choice = 0;
        /*
           ask the user for their choice
           use try block to read their choice
           If the choice is an int, then make sure its in the right range
           If its not an int, and goes to the catch, then give user a message
           Return this value
         */
        while (choice < 1 || choice > 6) {
            try {
                System.out.println(menu);
                choice = input.nextInt();

                if (choice >= 1 && choice <= 6) {
                    if (choice == 1) {
                        System.out.println("Sort by City");
                        choice = 0;
                    }
                    if (choice == 2) {
                        System.out.println("Sort by Performer (A-Z)");
                        choice = 0;
                    }
                    if (choice == 3) {
                        System.out.println("Sort by Performer (Z-A)");
                        choice = 0;
                    }
                    if (choice == 4) {
                        System.out.println("Sort by Price (High-Low)");
                        choice = 0;
                    }
                    if (choice == 5) {
                        System.out.println("Sort by Price (Low-High)");
                        choice = 0;
                    }
                    if (choice == 6) {
                        System.out.println("Quit");
                    }
                    break;
                }
                else {
                    System.out.println("Invalid entry, out of range.\n");
                }
            }

            catch (Exception e){
                if (input.hasNextInt()){
                    System.out.println("Invalid entry, out of range.\n");
                    input.nextLine();
                }
                else {
                    System.out.println("Invalid entry, you must enter an integer.\n");
                    input.nextLine();
                }
            }
        }
        return choice;
    }
}