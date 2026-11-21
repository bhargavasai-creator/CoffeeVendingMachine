package AutomaticBeverageVendingMachineProject;

public class Milk extends Condiment {

    public Milk() {
        this.quantity = 0;
    }

    @Override
    public void add() {
        if (this.quantity < 3) this.quantity++;
    }

    @Override
    public double getPrice() {
        return this.quantity * 0.5;
    }
}


