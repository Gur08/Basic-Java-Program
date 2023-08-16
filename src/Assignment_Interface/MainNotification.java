package Assignment_Interface;

public class MainNotification {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.phoneNumbers();
        phone.devicePushNotification();
        phone.sendEmailNotification();
        phone.sendNotification("Notification is send out");
        phone.SmsNotification();
        phone.settingRecipients();
    }
}
