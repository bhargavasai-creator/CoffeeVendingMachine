package AutomaticBeverageVendingMachineProject;

public class Coffee implements Beverage {
    private double price;
    private String description;

    public Coffee(double price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}

