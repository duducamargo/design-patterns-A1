package context;

import strategy.RiskStrategy;

public class RiskCalculator {

    private RiskStrategy strategy;

    public RiskCalculator(RiskStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RiskStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateRisk(double income, double assets, int age, boolean highVolatilityPreference) {
        return strategy.calculate(income, assets, age, highVolatilityPreference);
    }
}
