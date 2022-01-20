package U7.Lab;

import U6.TriviaLab.Question;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    public ArrayList<Show> show;

    public TicketMaster(ArrayList<Show> show) {
        this.show = show;
    }

    public TicketMaster() {
        this.show = new ArrayList<Show>();
    }

    public void readShow() throws FileNotFoundException {
        File data = new File("showData.txt");
        Scanner dataIn = new Scanner(data);
        while(dataIn.hasNext()){
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

    }

    public String toString(){
        String str = "";
        for(Show i:show){
            str += i +"\n";
        }
        return str;
    }

    public ArrayList<Show> getShow() {
        return show;
    }

    public void setShow(ArrayList<Show> show) {
        this.show = show;
    }
}
