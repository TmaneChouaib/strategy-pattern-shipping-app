package strategy;

public class StandardShippingStrategy implements IShippingStrategy {
    @Override
    public double calculate(double weight) {
        return 1 + weight;
    }
}
