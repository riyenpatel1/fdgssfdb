package U7.Lab;

public class Show {
    private String date,performer,city;
    private double price;
    private int qty;

    public Show(String date, String performer, String city, double price, int qty) {
        this.date = date;
        this.performer = performer;
        this.city = city;
        this.price = price;
        this.qty = qty;
    }

    public String toString() {
        String str = "  ";
        str += date + "\t   $";
        str += price + "\t  ";
        str += qty + "\t  ";
        if (qty < 10) {
            str += "\t  ";
        }
        str += performer;
        for (int i = 20-performer.length(); i > 0; i--) {
            str += " ";
        }
        str += city;
        return str;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}