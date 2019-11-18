package weather;

public interface Subject {
    void registerObserver(Observer observer);
    void deleteObserver(Observer observer);
    void informObservers();
}
