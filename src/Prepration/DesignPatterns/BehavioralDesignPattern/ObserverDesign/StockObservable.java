package Prepration.DesignPatterns.BehavioralDesignPattern.ObserverDesign;

public interface StockObservable {
    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);
    void notifySubscriber();
    void setStockCount(int stockAdded);
    int getStockCount();
}
