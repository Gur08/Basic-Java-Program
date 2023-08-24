package Assignment_Interface;

public class MainNotification {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.phoneNumbers());
        phone.devicePushNotification();
        phone.sendEmailNotification();
        phone.sendNotification();
        phone.SmsNotification();
        phone.settingRecipients();
    }
}
