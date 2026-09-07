public class PaypalPaymentFactory extends PaiementFactory{

    @Override
    public Paiement createPaiement(){
        return new PaypalPaiement();
    }

}
