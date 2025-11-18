package strategy;

public class ModerateRiskStrategy implements RiskStrategy {

    @Override
    public double calculate(double income, double assets, int age, boolean highVolatilityPreference) {
        double score = (assets * 0.4) + (income * 0.4) - (age * 0.3);

        if (highVolatilityPreference) {
            score += 10;
        }

        return Math.max(score, 0);
    }
}
