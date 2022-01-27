package U7.Lab;

import U6.TriviaLab.Question;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> show;

    public TicketMaster() {
        this.show = new ArrayList<Show>();
    }

    public String toString(){
        String str = "";
        for(Show i:show){
            str += i +"\n";
        }
        return str;
    }

    public void readShow() throws FileNotFoundException {
        System.out.println("\tDate\t|\tPrice\t| Qty |  \tPerformer\t  |\t\tCity");
        System.out.println("============ =========== ===== =================== ===============");
        File data = new File("showData.txt");
        Scanner dataIn = new Scanner(data);
        while(dataIn.hasNextLine()){
            String date = dataIn.next();
            double price = dataIn.nextDouble();
            int qty = dataIn.nextInt();
            String x = dataIn.nextLine();
            int y = x.indexOf(",");
            String performer = x.substring(0,y);
            String city = x.substring(y+1);
            Show s = new Show(date, performer, city, price, qty);
            show.add(s);
        }
        dataIn.close();

    }

//    public ArrayList<Show> searchCity() {
//
//    }
//
//    public void performer() {
//
//    }
//
//    public void price() {
//
//    }




    // Getters and Setters
    public ArrayList<Show> getShow() {
        return show;
    }

    public void setShow(ArrayList<Show> show) {
        this.show = show;
    }
}