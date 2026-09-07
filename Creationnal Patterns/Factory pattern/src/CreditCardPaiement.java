public class CreditCardPaiement implements Paiement{

    @Override
    public void pay(double amount){
        System.out.println("paid amount with credit card "+ amount);
    }

}
