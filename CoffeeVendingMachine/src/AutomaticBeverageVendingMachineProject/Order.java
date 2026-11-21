package AutomaticBeverageVendingMachineProject;

public class Order {
    private Beverage beverage;
    private Condiment sugar;
    private Condiment milk;

    public Order(Beverage beverage) {
        this.beverage = beverage;
        this.sugar = new Sugar();
        this.milk = new Milk();
    }

    public void addCondiment(Condiment condiment) {
        condiment.add();
    }

    public double getTotal() {
        return this.beverage.getPrice() + this.sugar.getPrice() + this.milk.getPrice();
    }
}
