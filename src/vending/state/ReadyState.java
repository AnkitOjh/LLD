package vending.state;

import vending.VendingMachine;

public class ReadyState implements VendingMachineState{
    private VendingMachine machine;
    public ReadyState(VendingMachine machine){
        this.machine = machine;
    }
    @Override
    public void addMoney(int amount) {
        System.out.println("Money is added");
    }

    @Override
    public void selectItem(String itemId) {

    }

    @Override
    public void dispatchProduct() {

    }

    @Override
    public void cancelTransaction() {

    }
}
