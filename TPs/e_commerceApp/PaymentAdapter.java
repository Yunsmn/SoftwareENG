package Software_Eng_TPs.Design_PatterTP.e_commerceApp;

import javax.smartcardio.Card;

public class PaymentAdapter implements PaymentProcessor{
    Object PaymentMethod;

    public void SetPaymentMethod(Object paymentMethod) {
        this.PaymentMethod = paymentMethod;
    }
    @Override
    public void payByCreditCard(double amount) {
        if (PaymentMethod instanceof QuickPay) {
            ((QuickPay) PaymentMethod).creditCardPayment(amount);
        } else if (PaymentMethod instanceof SafeTransfer) {
            ((SafeTransfer) PaymentMethod).payWithCard(amount);
        }
        else  {
            System.out.println("Invalid PaymentMethod");
        }
    }

    @Override
    public void payByPaypal(double amount) {

    }

    @Override
    public void refund(double amount) {

    }
}
