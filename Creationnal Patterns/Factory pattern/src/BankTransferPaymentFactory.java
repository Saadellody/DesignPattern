public class BankTransferPaymentFactory extends PaiementFactory{

    @Override
    public Paiement createPaiement(){
        return  new BankTrasnferPaiement();
    }
}
