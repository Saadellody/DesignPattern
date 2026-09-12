public class Thermostat implements Device{

    @Override
    public void turnOn(){
        System.out.println("The Thermostat is turn on ");
    }

    @Override
    public void turnOff(){
        System.out.println("The Thermostat is turn off ");
    }
}
