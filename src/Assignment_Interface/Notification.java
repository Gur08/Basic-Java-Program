package Assignment_Interface;

public class Notification implements NotificationSender{
    @Override
    public String sendNotification() {
        String x = "Notification send";
       return x;
    }
}
