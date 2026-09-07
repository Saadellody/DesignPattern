public class PypalFactory implements PayementFactory{

    @Override
    public Payment createPayement(){
        return new PaypalPayement();
    }

    @Override
    public Recipt createRecipt(){
        return new PaypalRecipt();
    }
}
