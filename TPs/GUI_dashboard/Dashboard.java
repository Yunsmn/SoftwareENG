package Software_Eng_TPs.Design_PatterTP.GUI_dashboard;

public class Dashboard {
    public static void main(String[] args) {

        Logger logger = new Logger();
        LabelUpdater labelUpdater = new LabelUpdater();
        NotificationSender notificationSender = new NotificationSender();


        Button submitButton = new Button("SubmitButton");
        Slider volumeSlider = new Slider("VolumeSlider");

        submitButton.registerObserver(logger);
        submitButton.registerObserver(labelUpdater);


        volumeSlider.registerObserver(logger);
        volumeSlider.registerObserver(notificationSender);

        System.out.println("--- Dashboard Initialized. Simulating user actions. ---");


        submitButton.click();
        volumeSlider.move(75);
        

        System.out.println("\n--- Disabling notifications for the volume slider. ---");
        volumeSlider.removeObserver(notificationSender);
        volumeSlider.move(50);
    }
}
