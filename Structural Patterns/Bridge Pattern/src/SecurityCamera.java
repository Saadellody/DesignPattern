public class SecurityCamera implements Device{

    @Override
    public void turnOn(){
        System.out.println("The SecurityCamera is turn on ");
    }

    @Override
    public void turnOff(){
        System.out.println("The SecurityCamera is turn off ");
    }
}
