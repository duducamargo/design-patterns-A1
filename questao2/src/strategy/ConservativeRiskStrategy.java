package strategy;

public class ConservativeRiskStrategy implements RiskStrategy {

    @Override
    public double calculate(double income, double assets, int age, boolean highVolatilityPreference) {
        double score = (assets * 0.2) + (income * 0.2) - (age * 0.5);

        if (!highVolatilityPreference) {
            score += 20;
        }

        return Math.max(score, 0);
    }
}
