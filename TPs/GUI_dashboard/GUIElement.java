package Software_Eng_TPs.Design_PatterTP.GUI_dashboard;

import java.util.ArrayList;
import java.util.List;

public abstract class GUIElement implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final String name;

    public GUIElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String event) {
        String fullEvent = name + ": " + event;
        for (Observer observer : observers) {
            observer.update(fullEvent);
        }
    }
}
