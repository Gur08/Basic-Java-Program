package Assignment_Interface;

public class EmailNotificationSender implements EmailNotification{

    @Override
    public void settingRecipients() {
        System.out.println("Setting Recipients");
    }

    @Override
    public void sendEmailNotification() {
        System.out.println("Email send out");
    }
}
