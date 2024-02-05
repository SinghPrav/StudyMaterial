package OldMaterial.designpatterns.creational.factorydesign;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Send SMS notification");
    }
}
