package U6.TriviaLab;

import U6.ReadingFile.Course;

public class Question {
    // Instance variables
    private String question, a, b, c , d, ans;
    private int betAmount;

    // Constructor
    public Question(String question, String a, String b, String c, String d, String ans) {
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.ans = ans;
        this.betAmount = 0;
    }

    // toString
    public String toString() {
        String str = "";
        str += question;
        str += " ($" + betAmount + ")";
        str += "\n\t" + a + "\n\t" + b + "\n\t" + c + "\n\t" + d;
        return str;
    }



    // Getters and setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public int getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
}
