package strategy;

public interface RiskStrategy {
    double calculate(double income, double assets, int age, boolean highVolatilityPreference);
}
