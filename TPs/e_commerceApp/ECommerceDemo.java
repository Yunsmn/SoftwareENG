package Software_Eng_TPs.Design_PatterTP.e_commerceApp;

public class ECommerceDemo {
    public static void main(String[] args) {
        PaymentAdapter adapter = new PaymentAdapter();

        adapter.SetPaymentMethod(new QuickPay());
        adapter.payByCreditCard(100.0);


        adapter.SetPaymentMethod(new SafeTransfer());
        adapter.payByCreditCard(200.0);
    }
}
