package strategy;

public class AggressiveRiskStrategy implements RiskStrategy {

    @Override
    public double calculate(double income, double assets, int age, boolean highVolatilityPreference) {
        double score = (assets * 0.6) + (income * 0.3) - (age * 0.2);

        if (highVolatilityPreference) {
            score += 50; 
        }

        return Math.max(score, 0);
    }
}
