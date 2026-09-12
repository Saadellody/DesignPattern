public class Thermostat implements Device{

    @Override
    public void turnOn(){
        System.out.println("The light is turn on ");
    }

    @Override
    public void turnOff(){
        System.out.println("The light is turn off ");
    }
}
