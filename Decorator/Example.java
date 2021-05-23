package me.ianguuima.decorator;

interface IceCream {
    String getFlavor();
}

abstract class IceCreamDecorator implements IceCream {

    private final IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getFlavor() {
        return iceCream.getFlavor();
    }

}

class SimpleIceCream implements IceCream {

    private final String flavor;

    SimpleIceCream(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String getFlavor() {
        return flavor;
    }
}

class IceCreamWithChocolate extends IceCreamDecorator {

    public IceCreamWithChocolate(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getFlavor() {
        return super.getFlavor() + " with chocolate!";
    }
}

public class Decorator {

    public static void main(String[] args) {
        IceCream vanilla = new SimpleIceCream("Vanilla");

        IceCreamWithChocolate iceCreamWithChocolate = new IceCreamWithChocolate(vanilla);
        System.out.println(iceCreamWithChocolate.getFlavor());
    }
}