package OldMaterial.designpatterns.creational.factorydesign;

public class FactoryPatternClient {
    public static void main(String[] args) {
            NotificationFactory notificationFactory = new NotificationFactory();
            Notification smsNotification = notificationFactory.createNotification("SMS");
            smsNotification.notifyUser();
            Notification emailNotification = notificationFactory.createNotification("EMAIL");
            emailNotification.notifyUser();
            Notification pushNotification = notificationFactory.createNotification("Default");
            pushNotification.notifyUser();
    }
}
