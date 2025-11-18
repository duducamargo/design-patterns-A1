import java.util.Scanner;

import observer.EnvironmentalSensor;
import modules.AlertModule;
import modules.ControlPanelModule;
import modules.HistoryModule;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EnvironmentalSensor sensor = new EnvironmentalSensor();

        sensor.addObserver(new ControlPanelModule());
        sensor.addObserver(new AlertModule());
        sensor.addObserver(new HistoryModule());

        System.out.println("=== Sistema de Monitoramento Ambiental ===");

        while (true) {
            System.out.print("\nDigite temperatura (ou -1 para sair): ");
            double temp = scanner.nextDouble();
            if (temp == -1) break;

            System.out.print("Digite umidade: ");
            double humidity = scanner.nextDouble();

            System.out.print("Digite índice de poluição: ");
            double pollution = scanner.nextDouble();

            System.out.println("\nAtualizando sensores...\n");
            sensor.setData(temp, humidity, pollution);
        }

        scanner.close();
        System.out.println("Sistema encerrado.");
    }
}
