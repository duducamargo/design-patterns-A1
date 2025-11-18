import java.util.Scanner;
import context.RiskCalculator;
import strategy.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o modelo de risco:");
        System.out.println("1 - Aggressive");
        System.out.println("2 - Moderate");
        System.out.println("3 - Conservative");
        System.out.print("Opção: ");

        int option = scanner.nextInt();

        RiskStrategy strategy = switch (option) {
            case 1 -> new AggressiveRiskStrategy();
            case 2 -> new ModerateRiskStrategy();
            case 3 -> new ConservativeRiskStrategy();
            default -> {
                System.out.println("Opção inválida!");
                yield null;
            }
        };

        if (strategy == null) return;

        RiskCalculator calculator = new RiskCalculator(strategy);

        double result = calculator.calculateRisk(
                8000,      
                150000,    
                30,       
                true       
        );

        System.out.println("Score final: " + result);

        scanner.close();
    }
}
