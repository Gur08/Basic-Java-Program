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
    public String sendNotification() {
        String x ="Notification send out";
       return x;
    }

    @Override
    public void devicePushNotification() {
        System.out.println("Device Notification Send");
    }


    @Override
    public String phoneNumbers() {
       String x="5149148131";
        return x;
    }

    @Override
    public void SmsNotification() {
        System.out.println("You received a new message");
    }
}
