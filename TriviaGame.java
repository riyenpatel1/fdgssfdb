package U6.TriviaLab;

import U6.ReadingFile.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    private Question[] myQuestions;
    private int balanceChange, totalBalance, streak;

    public TriviaGame() {
        this.myQuestions = new Question[12];
        this.balanceChange = 0;
        this.totalBalance = 500;
        this.streak = 0;
    }


    public void readQuestion() throws FileNotFoundException {
        Scanner questions = new Scanner(new File("triviaQuestions.txt"));
        for (int i = 0; i < 12; i++) {
            String question = questions.nextLine();
            String a = questions.nextLine();
            String b = questions.nextLine();
            String c = questions.nextLine();
            String d = questions.nextLine();
            String ans = questions.nextLine();

            Question q = new Question(question, a, b, c, d, ans);
            setOneQuestion(i, q);
            //System.out.println(q);
        }
    }

    public String toString() {
        String x = "Current Balance:  " + totalBalance;
        x += "\nBalance Change:\t  " + balanceChange;
        x += "\nCurrent Streak:\t  " + streak;
        return x;
    }


    public void setOneQuestion(int num, Question q) {
        myQuestions[num] = q;
    }

    public Question[] getMyQuestions() {
        return myQuestions;
    }

    public void setMyQuestions(Question[] myQuestions) {
        this.myQuestions = myQuestions;
    }

    public int getBalanceChange() {
        return balanceChange;
    }

    public void setBalanceChange(int balanceChange) {
        this.balanceChange = balanceChange;
    }

    public int getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(int totalBalance) {
        this.totalBalance = totalBalance;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }
}
