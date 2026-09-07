public class PaypalPayement implements Payment{

    @Override
    public void pay(double amount){
        System.out.println("amount paid with paypal card ");
    }
}
