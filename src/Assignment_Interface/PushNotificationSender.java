package Assignment_Interface;

public class PushNotificationSender implements PushNotification{
    @Override
    public void devicePushNotification() {
        System.out.println("Push Notification send on Device");
    }
}
