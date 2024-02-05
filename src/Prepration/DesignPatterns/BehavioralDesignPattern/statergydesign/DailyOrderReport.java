package Prepration.DesignPatterns.BehavioralDesignPattern.statergydesign;

import java.util.List;

public class DailyOrderReport implements OrderReportStrategy{
    @Override
    public void printOrderReport(List<Order> orders) {
        System.out.println("************ Daily Report******");
        for (Order order: orders) {
            System.out.println("************ Order name :: "+order.getOrderName());
            System.out.println("************ Order amount :: "+order.getAmount());
            System.out.println("************ Order date :: "+order.getOrderDate());
        }

        System.out.println("************ End of daily report ***********");
    }
}
