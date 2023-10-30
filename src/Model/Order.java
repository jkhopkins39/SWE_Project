package Model;

import java.util.ArrayList;

public class Order {
    public static int orderNumber;
    public String orderType;
    public String paymentType;
    public double total;
    public String orderStatus;
    public Order() {
        this.orderNumber = 0;
        this.orderType = "";
        this.paymentType = "";
        this.total = 0;
        this.orderStatus = "";
    }

    public Order(String orderType, String paymentType, int total, String orderStatus) {
        orderNumber++;
        this.orderNumber = orderNumber;
        this.orderType = orderType;
        this.paymentType = paymentType;
        this.total = total;
        this.orderStatus = orderStatus;
    }

    ArrayList<Order> orderList = new ArrayList<Order>();
}
