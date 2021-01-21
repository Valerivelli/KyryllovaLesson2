package hw5;

import java.util.Date;
import java.util.Objects;

public class Order {
    private String item;
    private double size;
    private double price;
    private Date deliveryDate;

    public Order(String item, double size, double price, Date deliveryDate){
        this.item = item;
        this.size = size;
        this.price = price;
        this.deliveryDate = deliveryDate;
    }

    public String setItem(){
        return item;
    }
    public double setSize(){
        return size;
    }
    public double setPrice(){
        return price;
    }
    public Date setDeliveryDate(String date){
        return deliveryDate;
    }

    public String getItem(){
        return item;
    }
    public double getSize(){
        return size;
    }
    public double getPrice(){
        return price;
    }
    public Date getDeliveryDate(Date deliveryDate){
        return deliveryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order that = (Order) o;
        return Objects.equals(this.item, that.item)
                && Objects.equals(this.size, that.size)
                && Objects.equals(this.deliveryDate, that.deliveryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, size, price, deliveryDate);
    }
    public String toString() {
        return "Order {" +
                "item = '" + item + '\'' +
                ", size = '" + size + '\'' + " kg" +
                ", price = '" + price + '\'' + " UAH " +
                ", date of delivery = '" + deliveryDate + '\'' +
                '}';
    }
}
