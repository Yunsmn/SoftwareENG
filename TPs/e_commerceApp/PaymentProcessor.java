package Software_Eng_TPs.Design_PatterTP.e_commerceApp;

public interface PaymentProcessor {
    void payByCreditCard(double amount);
    void payByPaypal(double amount);
    void refund(double amount);
}
