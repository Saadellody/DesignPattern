public class CreditCardPaymentFactory extends PaiementFactory{

    @Override
    public Paiement createPaiement(){
        return new CreditCardPaiement();
    }

}
