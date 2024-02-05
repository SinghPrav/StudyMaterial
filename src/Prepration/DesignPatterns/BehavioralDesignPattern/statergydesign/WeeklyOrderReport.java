package Prepration.DesignPatterns.BehavioralDesignPattern.statergydesign;

import java.util.List;

public class WeeklyOrderReport implements OrderReportStrategy{
    @Override
    public void printOrderReport(List<Order> orders) {
        System.out.println("************ Weekly Report******");
        double totAmount = 0;
        for (Order order: orders) {
            System.out.println("************ Order name :: "+order.getOrderName());
            System.out.println("************ Order amount :: "+order.getAmount());
            totAmount+= order.getAmount();
        }
        System.out.println("************ Total amount :: "+totAmount);
        System.out.println("************ End of Weekly report ***********");
    }
}
