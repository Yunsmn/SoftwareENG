package Software_Eng_TPs.Design_PatterTP.GUI_dashboard;

public class LabelUpdater implements Observer {
    @Override
    public void update(String event) {
        System.out.println("LabelUpdater: Updating GUI label with last action  " + event);
    }
}
