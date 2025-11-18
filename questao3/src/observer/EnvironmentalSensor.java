package observer;

import java.util.ArrayList;
import java.util.List;

public class EnvironmentalSensor implements SensorSubject {

    private List<SensorObserver> observers = new ArrayList<>();
    private SensorData data;

    @Override
    public void addObserver(SensorObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(SensorObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (SensorObserver obs : observers) {
            obs.update(data);
        }
    }

    public void setData(double temp, double humidity, double pollution) {
        this.data = new SensorData(temp, humidity, pollution);
        notifyObservers();
    }
}
