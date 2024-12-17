package vending.state;

import vending.VendingMachine;

public class ReadyState implements VendingMachineState{
    private VendingMachine machine;
    private VendingMachineState dispatchState;
    private VendingMachineState idealState;
    public ReadyState(VendingMachine machine){
        this.machine = machine;
        this.dispatchState = new DispatchState();
        this.idealState = new IdleState(machine);
    }
    @Override
    public void addMoney(int amount) {
        System.out.println("Money is added");
    }

    @Override
    public void selectItem(String itemId) {
        machine.selectedItem(itemId);
        machine.changeState(this.dispatchState);
    }

    @Override
    public void dispatchProduct() {
        System.out.println("Order can't be dispatched");

    }

    @Override
    public void cancelTransaction() {
        System.out.println("Transaction is cancelled");
        machine.changeState(this.idealState);
    }
}
