package modules;

import observer.SensorData;
import observer.SensorObserver;

public class HistoryModule implements SensorObserver {

    @Override
    public void update(SensorData data) {
        System.out.println("\n[History Module]");
        System.out.println("Registrando dados...");
        System.out.println("-> Temp: " + data.temperature +
                ", Humidity: " + data.humidity +
                ", Pollution: " + data.pollutionIndex);
    }
}
