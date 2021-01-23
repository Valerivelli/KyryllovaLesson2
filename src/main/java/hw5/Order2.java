package hw5;

import java.util.Date;
import java.util.Objects;

//immutable
public class Order2 {
    private final String item;
    private final double size;
    private final double price;
    private final Date deliveryDate;

    public Order2(String item, double size, double price, Date deliveryDate) {
        this.item = item;
        this.size = size;
        this.price = price;
        this.deliveryDate = deliveryDate;
    }

    public String getItem() {
        return item;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public Date getDeliveryDate(Date deliveryDate) {
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
