package vending.state;

import vending.VendingMachine;
import vending.state.VendingMachineState;

public class IdleState implements VendingMachineState {
    public VendingMachine machine;
    public IdleState(VendingMachine machine){
        this.machine = machine;
    }
    @Override
    public void addMoney(int amount) {
        System.out.println("Money is added");
        machine.setBalance(amount);
        machine.changeState(new ReadyState(machine));
    }

    @Override
    public void selectItem(String itemId) {
        System.out.println("First do the payment");
    }

    @Override
    public void dispatchProduct() {
        System.out.println("Money is not added do the payment first");
    }

    @Override
    public void cancelTransaction() {
    System.out.println("No payment to cancel");
    }
}
