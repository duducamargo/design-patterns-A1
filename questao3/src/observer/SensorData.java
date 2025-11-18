package observer;

public class SensorData {
    public double temperature;
    public double humidity;
    public double pollutionIndex;

    public SensorData(double temperature, double humidity, double pollutionIndex) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pollutionIndex = pollutionIndex;
    }
}
