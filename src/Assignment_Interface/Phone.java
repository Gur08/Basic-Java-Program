package Assignment_Interface;

public class Phone implements SMSNotification,EmailNotification,PushNotification,NotificationSender{
    @Override
    public void settingRecipients() {
        System.out.println("Setting Recipients for Email");
    }

    @Override
    public void sendEmailNotification() {
        System.out.println("Email Notification send");
    }

    @Override
    public String sendNotification(String x) {
        System.out.println(x);
       return x;
    }

    @Override
    public void devicePushNotification() {
        System.out.println("Device Notification Send");
    }

    @Override
    public void phoneNumbers() {
        System.out.println("Phone no is ");
    }

    @Override
    public void SmsNotification() {
        System.out.println("You received a new message");
    }
}
