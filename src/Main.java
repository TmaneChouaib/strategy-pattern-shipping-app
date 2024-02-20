import strategy.ExpressShippingStrategy;
import strategy.IShippingStrategy;
import strategy.StandardShippingStrategy;

class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        IShippingStrategy shippingStrategy = new StandardShippingStrategy();

        System.out.println("______________________________________________");
        shoppingCart.setIShippingStrategy(shippingStrategy);
        double cost = shoppingCart.calculateShippingCost(10);
        System.out.println("The cost with StandardShippingStrategy " + cost);


        System.out.println("______________________________________________");
        shippingStrategy = new ExpressShippingStrategy();
        shoppingCart.setIShippingStrategy(shippingStrategy);
        cost = shoppingCart.calculateShippingCost(10);
        System.out.println("The cost with ExpressShippingStrategy " + cost);

    }
}