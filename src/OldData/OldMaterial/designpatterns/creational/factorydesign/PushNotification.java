package OldData.OldMaterial.designpatterns.creational.factorydesign;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Send push notification");
    }
}
