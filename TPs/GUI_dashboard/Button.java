package Software_Eng_TPs.Design_PatterTP.GUI_dashboard;

public class Button extends GUIElement {

    public Button(String name) {
        super(name);
    }

    public void click() {
        System.out.println("\n--- User Action: Clicked " + getName() + " ---");
        notifyObservers("Clicked");
    }
}
