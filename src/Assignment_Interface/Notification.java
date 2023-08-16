package Assignment_Interface;

public class Notification implements NotificationSender{
    @Override
    public String sendNotification(String x) {
        System.out.println(x);
        return null;
    }
}
