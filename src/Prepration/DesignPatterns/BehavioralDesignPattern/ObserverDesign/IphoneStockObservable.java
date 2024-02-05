package Prepration.DesignPatterns.BehavioralDesignPattern.ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{
    public List<NotificationObserver> notificationObservers = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationObserver notificationObserver) {

    }

    @Override
    public void remove(NotificationObserver notificationObserver) {

    }

    @Override
    public void notifySubscriber() {

    }

    @Override
    public void setStockCount(int stockAdded) {

    }

    @Override
    public int getStockCount() {
        return 0;
    }
}
