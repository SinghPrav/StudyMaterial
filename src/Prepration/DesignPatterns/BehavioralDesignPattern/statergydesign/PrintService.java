package Prepration.DesignPatterns.BehavioralDesignPattern.statergydesign;

import java.util.List;

public class PrintService {
    OrderReportStrategy orderReportStrategy;

    PrintService(OrderReportStrategy orderReportStrategy) {
        this.orderReportStrategy = orderReportStrategy;
    }

    public void printOrderDetail(List<Order> orders) {
        orderReportStrategy.printOrderReport(orders);
    }
}
