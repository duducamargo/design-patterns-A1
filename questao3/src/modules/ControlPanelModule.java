package modules;

import observer.SensorData;
import observer.SensorObserver;

public class ControlPanelModule implements SensorObserver {

    @Override
    public void update(SensorData data) {
        System.out.println("\n[Control Panel]");
        System.out.println("Temp: " + data.temperature);
        System.out.println("Humidity: " + data.humidity);
        System.out.println("Pollution Index: " + data.pollutionIndex);
    }
}
