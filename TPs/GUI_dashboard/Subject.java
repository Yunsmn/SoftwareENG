package Software_Eng_TPs.Design_PatterTP.GUI_dashboard;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String event);
}
