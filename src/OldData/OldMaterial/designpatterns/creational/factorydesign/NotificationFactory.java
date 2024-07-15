package OldData.OldMaterial.designpatterns.creational.factorydesign;

public class NotificationFactory {
        public Notification createNotification(String channel){
            if(channel.equalsIgnoreCase("SMS")){
                return new SmsNotification();
            }else if(channel.equalsIgnoreCase("EMAIL")) {
                return new EmailNotification();
            }else {
                return new PushNotification();
            }
        }
}
