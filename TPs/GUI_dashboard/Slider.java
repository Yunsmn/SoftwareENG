package Software_Eng_TPs.Design_PatterTP.GUI_dashboard;

public class Slider extends GUIElement {

    public Slider(String name) {
        super(name);
    }

    public void move(int value) {
        System.out.println("\n--- User Action: Moved " + getName() + " ---");
        notifyObservers("Moved to value " + value);
    }
}
