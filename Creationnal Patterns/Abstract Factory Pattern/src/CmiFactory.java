public class CmiFactory implements PayementFactory{

    @Override
    public Payment createPayement(){
        return new CmiPayment();
    }

    public Recipt createRecipt(){
        return new cmiRecipt();
    }

}
