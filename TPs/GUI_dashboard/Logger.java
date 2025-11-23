package Software_Eng_TPs.Design_PatterTP.GUI_dashboard;

public class Logger implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Logger: Logging user interaction " + event);
    }
}
