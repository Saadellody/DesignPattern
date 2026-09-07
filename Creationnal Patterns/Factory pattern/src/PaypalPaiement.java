public class PaypalPaiement implements Paiement{

    @Override
    public void pay(double amount){
        System.out.println("paid amount with paypal is "+amount);
    }
}
