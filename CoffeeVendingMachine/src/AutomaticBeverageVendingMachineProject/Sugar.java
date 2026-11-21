package AutomaticBeverageVendingMachineProject;

public class Sugar extends Condiment {

    public Sugar() {
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

