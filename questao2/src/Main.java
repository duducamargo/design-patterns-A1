import context.RiskCalculator;
import strategy.AggressiveRiskStrategy;
import strategy.ModerateRiskStrategy;
import strategy.ConservativeRiskStrategy;
import strategy.RiskStrategy;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Use: aggressive, moderate ou conservative");
            return;
        }

        String type = args[0].toLowerCase();
        RiskStrategy strategy = null;

        switch (type) {
            case "aggressive":
                strategy = new AggressiveRiskStrategy();
                break;
            case "moderate":
                strategy = new ModerateRiskStrategy();
                break;
            case "conservative":
                strategy = new ConservativeRiskStrategy();
                break;
            default:
                System.out.println("Modelo inválido.");
                return;
        }

        RiskCalculator calculator = new RiskCalculator(strategy);

        double result = calculator.calculateRisk(
                8000,      
                150000,    
                30,        
                true      
        );

        System.out.println("Score de Risco = " + result);
    }
}
