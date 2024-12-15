package vending.payment;

public class PaymentProcessor {
    private Payment payment;

    public void addMoney(int amount){
        this.payment = new Payment(amount);
    }
}
