package restaurant.observer.clase;

public interface Subject{
    void adaugareObserver(IObserver observer);
    void stergereObserver(IObserver observer);
    void notificaObserveri(String mesaj);
}
