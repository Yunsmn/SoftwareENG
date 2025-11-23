package Software_Eng_TPs.Design_PatterTP.e_commerceApp;

public class SafeTransfer extends Payment {

    public void payWithCard ( double amount ) {
        System.out.println ( " SafeTransfer : Paying with credit card $ " + amount );
    }
    public void payWithPayPal ( double amount ) {
        System.out.println( " SafeTransfer : Paying with PayPal $ " + amount );
    }
    public void refundPayment ( double amount ) {
         System.out.println( " SafeTransfer : Refunding payment $ " + amount );
    }
}
