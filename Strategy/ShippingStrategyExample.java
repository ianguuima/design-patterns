interface ShippingStrategy {
    int calculate();
}

class ShippingCalculator {

    private ShippingStrategy shippingStrategy;

    public ShippingCalculator(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public int calculate() {
        return shippingStrategy.calculate();
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }
}

class MercadoEnvios implements ShippingStrategy {
    @Override
    public int calculate() {
        return 20;
    }
}

class Correios implements ShippingStrategy {
    @Override
    public int calculate() {
        return 50;
    }
}

public class ShippingStrategyExample {

    public static void main(String[] args) {
        Correios correios = new Correios();
        ShippingCalculator shippingCalculator = new ShippingCalculator(correios);

        int shippingCost = shippingCalculator.calculate();

        System.out.println(shippingCost);
    }


}
