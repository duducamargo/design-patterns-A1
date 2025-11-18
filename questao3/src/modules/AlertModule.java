package modules;

import observer.SensorData;
import observer.SensorObserver;

public class AlertModule implements SensorObserver {

    @Override
    public void update(SensorData data) {
        System.out.println("\n[Alert Module]");

        if (data.temperature > 35) {
            System.out.println("Alerta: Temperatura elevada!");
        }
        if (data.pollutionIndex > 80) {
            System.out.println("Alerta: Poluição crítica!");
        }

        if (data.temperature <= 35 && data.pollutionIndex <= 80) {
            System.out.println("Nenhum alerta.");
        }
    }
}
