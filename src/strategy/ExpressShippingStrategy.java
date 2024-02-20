package strategy;

public class ExpressShippingStrategy implements IShippingStrategy {
    @Override
    public double calculate(double weight) {
        return 3 * weight;
    }
}
