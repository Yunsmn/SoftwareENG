package Software_Eng_TPs.Design_PatterTP.e_commerceApp;

public class QuickPay extends Payment {
    public void creditCardPayment ( double amount ) {
        System.out.println ( " QuickPay : Processing credit card payment $ " + amount ) ;
    }

    public void paypalPayment ( double amount ) {
        System.out.println ( " QuickPay : Processing PayPal payment $ " + amount ) ;
    }

    public void reverseTransaction ( double amount ) {
         System.out.println ( " QuickPay : Reversing transaction $ " + amount ) ;
    }
}
