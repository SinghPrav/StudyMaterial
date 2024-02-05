package OldMaterial.designpatterns.behavioral.observer;

public interface Subject {
    public void registerObserver(ScoreObserver o);
    public void unregisterObserver(ScoreObserver o);
    public void notifyObservers();
}
