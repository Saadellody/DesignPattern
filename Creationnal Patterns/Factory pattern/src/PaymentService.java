public class PaymentService {

    private  PaiementFactory factory;

    public PaymentService(PaiementFactory factory){
        this.factory=factory;
    }

    public void processPayment(double amount) {

        Paiement payment = factory.createPaiement();

        payment.pay(amount);
    }
}
