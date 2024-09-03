
package restaurantsystem.model;


public class Order {
    private int orderID;
    private double price;
    private String date;

    public Order(int orderID, double price, String date) {
        this.orderID = orderID;
        this.price = price;
        this.date = date;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
