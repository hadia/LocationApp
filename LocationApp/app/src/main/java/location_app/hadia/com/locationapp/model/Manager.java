package location_app.hadia.com.locationapp.model;

import java.util.Observable;
import java.util.Observer;



public abstract class Manager extends Observable {

    public void register(Observer observer) {
        addObserver(observer);
    }

    public void unregister(Observer observer) {
        deleteObserver(observer);
    }

    public void notify(Payload payload) {
        setChanged();
        notifyObservers(payload);
    }
}
