public class BankTrasnferPaiement implements Paiement{

    @Override
    public void pay(double amount) {
        System.out.println("paid amount with bank transfere is " + amount);
    }
}
