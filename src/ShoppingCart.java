import strategy.IShippingStrategy;

public class ShoppingCart {
    private IShippingStrategy iShippingStrategy;

    public void setIShippingStrategy(IShippingStrategy iShippingStrategy) {
        this.iShippingStrategy = iShippingStrategy;
    }

    public double calculateShippingCost(double weight) {
        return iShippingStrategy.calculate(weight);
    }
}
