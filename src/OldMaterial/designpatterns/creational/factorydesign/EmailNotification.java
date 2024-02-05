package OldMaterial.designpatterns.creational.factorydesign;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Send Email notification");
    }
}
