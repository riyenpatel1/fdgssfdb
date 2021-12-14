package U6.TriviaLab;

import U6.ReadingFile.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        // Makes trivia game and makes pulls array of questions
        TriviaGame game = new TriviaGame();
        game.readQuestion();
        Question[] myQuestions = game.getMyQuestions();

        // Variables
        String reply = "Y";
        int bet = 0;
        String answer = "";
        int[] usedNums = new int[12];

        System.out.println("SPORTS TRIVIA RULES!\n -You'll start off with $500\n " +
                "-12 questions each worth the amount you bet\n " +
                "-If you get the question right, you gain money\n -If you get it" +
                "wrong, you lose money\n -You can stop playing whenever you want\n " +
                "-Your final balance is how much money you win/lose\n ");


        Scanner input = new Scanner(System.in);
        while (reply.equalsIgnoreCase("Y")) {
            System.out.println("How much money do you want to bet? ");
            bet = input.nextInt();
            input.nextLine();

            for (int j=0; j<12; j++) {
                int x = (int)(Math.random()*12);
                for (int i: usedNums) {
                    if (x == i) {
                        x = (int)(Math.random()*12);
                    }
                }
                myQuestions[x].setBetAmount(bet);
                System.out.println(myQuestions[x]);
                answer = input.nextLine();
                System.out.println(game);
            }


            System.out.println("Do you want to continue (Y/N)");
            reply = input.nextLine();
        }


        // Win/lose print statement
        if (game.getTotalBalance() > 0) {
            System.out.println("Congrats! You won $" + game.getTotalBalance());
        }
        else if (game.getTotalBalance() < 0) {
            System.out.println("Sorry! You lost $" + game.getTotalBalance());
        }
        else {
            System.out.println("You broke even");
        }
    }
}
