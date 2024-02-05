package Prepration.DesignPatterns.BehavioralDesignPattern.statergydesign;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        PrintService printDaily = new PrintService(new DailyOrderReport());
        PrintService printWeekly = new PrintService(new WeeklyOrderReport());
        List<Order> orderList = new ArrayList<>();
        for(int i=0;i<5; i++){
            Order order = new Order();
            order.setOrderName("Mobile:: "+(i+1));
            order.setOrderDate("Sep 2023:: "+ (i+2));
            order.setAmount(10000*(i+1));
            orderList.add(order);
        }
        printDaily.printOrderDetail(orderList);
        printWeekly.printOrderDetail(orderList);
    }
}
