package me.shrp.state;

/**
 * Description
 * Created by lynxs on 2018/1/18.
 */
public class Main {
    public static void main(String[] args) {
        final Order order = new Order(100);
        order.paid(100);
        order.checkout();
        if (order.success()) {
            System.out.println("order success, client get change " + order.getChange());
        }
        final Order order1 = new Order(100);
        order1.paid(99);
        order1.checkout();
        if (order1.success()) {
            System.out.println("order1 success, client get change " + order1.getChange());
        } else {
            System.out.println("order1 failed, client get change " + order1.getChange());
        }
        final Order order2 = new Order(100);
        order2.paid(101);
        order2.checkout();
        if (order2.success()) {
            System.out.println("order2 success, client get change " + order2.getChange());
        }
        final Order order3 = new Order(100);
        order3.paid(40);
        order3.paid(60);
        order3.checkout();
        if (order3.success()) {
            System.out.println("order3 success, client get change " + order3.getChange());
        }
    }
}
