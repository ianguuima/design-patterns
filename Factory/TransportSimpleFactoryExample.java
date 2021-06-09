interface Transport {
    void deliver();
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

class TransportFactory {
    public Transport createTransport(String vehicle){
        if (vehicle.equalsIgnoreCase("Car")){
            return new Car();
        } else if (vehicle.equalsIgnoreCase("Ship")){
            return new Ship();
        }
        return null;
    }
}

public class TransportSimpleFactoryExample {
    public static void main(String[] args){
        TransportFactory factory = new TransportFactory();
        Transport transport = factory.createTransport("ship");

        transport.deliver();
    }
}
