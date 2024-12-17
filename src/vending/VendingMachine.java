package vending;

import vending.payment.PaymentProcessor;
import vending.state.IdleState;
import vending.state.VendingMachineState;

public class VendingMachine {
    private VendingMachineState currentState;
    private PaymentProcessor paymentProcessor;
    VendingMachine(){
        this.currentState = new IdleState(this);
        this.paymentProcessor = new PaymentProcessor();
    }
    public void changeState(VendingMachineState currentState){
        this.currentState = currentState;
    }
    public void addMoney(int amount){
        this.currentState.addMoney(amount);
    }

    public void selectItem(String itemId){
        this.currentState.selectItem(itemId);
    }

    public void selectedItem(String itemId){

    }


    public void setBalance(int amount){
        paymentProcessor.addMoney(amount);
    }
}
