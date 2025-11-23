package Software_Eng_TPs.Design_PatterTP.GUI_dashboard;

public class NotificationSender implements Observer {
    @Override
    public void update(String event) {
        System.out.println("NotificationSender: Sending alert for " + event);
    }
}
