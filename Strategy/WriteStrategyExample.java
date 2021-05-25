interface WriteStrategy {
    void write();
}

class WriteContext {
    private WriteStrategy strategy;

    public void write() {
        strategy.write();
    }

    public void setStrategy(WriteStrategy strategy) {
        this.strategy = strategy;
    }
}

class PenStrategy implements WriteStrategy {
    @Override
    public void write() {
        openSlip();
        System.out.println("Starting to write");
    }

    // ponta da caneta
    private void openSlip() {
        System.out.println("Opening slip of the pen");
    }
}

class PencilStrategy implements WriteStrategy {
    @Override
    public void write() {
        sharpPencil();
        System.out.println("Starting to write");
    }

    // Apontar o lápis
    private void sharpPencil() {
        System.out.println("Sharping the pencil before use");
    }
}


class WriteStrategyExample {

    public static void main(String[] args) {
        WriteContext writeContext = new WriteContext();

        writeContext.setStrategy(new PencilStrategy());
        writeContext.write();

        writeContext.setStrategy(new PenStrategy());
        writeContext.write();
    }

}