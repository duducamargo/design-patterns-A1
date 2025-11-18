import java.util.Scanner;
import chain.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FraudCheck value = new ValueCheck();
        FraudCheck geo = new GeoCheck();
        FraudCheck history = new HistoryCheck();
        FraudCheck device = new DeviceCheck();

        value.setNext(geo);
        geo.setNext(history);
        history.setNext(device);

        System.out.println("=== Sistema Antifraude ===");

        while (true) {
            System.out.print("\nValor da transação (-1 para sair): ");
            double amount = scanner.nextDouble();
            if (amount == -1) break;

            System.out.print("Localização (ex: BR): ");
            String location = scanner.next();

            System.out.print("Score do usuário (0-100): ");
            int score = scanner.nextInt();

            System.out.print("Dispositivo (mobile, pc, unknown): ");
            String deviceName = scanner.next();

            Transaction tx = new Transaction(amount, location, score, deviceName);

            System.out.println("\nProcessando...\n");

            boolean result = value.check(tx);

            if (result)
                System.out.println("Transação APROVADA");
            else
                System.out.println("Transação REJEITADA");
        }

        scanner.close();
        System.out.println("Sistema encerrado.");
    }
}
