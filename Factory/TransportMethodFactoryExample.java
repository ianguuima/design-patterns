interface Transport {
    void deliver();
}

abstract class TransportFactory {
    public abstract Transport createTransport();
}

class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by car!");
    }
}

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by ship!");
    }
}

class CarTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}

class ShipTransportFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

class TransportFactoryMain {
    public static void main(String[] args) {
        CarTransportFactory factory = new CarTransportFactory();
        Transport transport = factory.createTransport();

        transport.deliver();
    }
}