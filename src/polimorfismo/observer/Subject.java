package polimorfismo.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    public List<Observer> observers = new ArrayList<>();

    public void register(Observer ...observers) {

        for(var observer : observers) {
            this.observers.add(observer);
        }

    }

    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    public void publish() {

        observers.forEach(observer -> {
            observer.publish();
        });

    }


}
