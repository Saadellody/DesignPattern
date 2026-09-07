public class PayementApplication {

    private Payment payment;
    private Recipt  recipt;

    public PayementApplication(PayementFactory factory){
        this.payment= factory.createPayement();
        this.recipt= factory.createRecipt();
    }

    public void process(double amount){
        payment.pay(amount);
        recipt.generate();
    }
}
