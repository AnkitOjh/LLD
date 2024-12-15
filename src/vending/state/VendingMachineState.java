package vending.state;

public interface VendingMachineState {
    void addMoney(int amount);
    void selectItem(String itemId);

    void dispatchProduct();
    void cancelTransaction();

}
