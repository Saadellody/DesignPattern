public abstract  class Controller {

    protected Device device;

    public Controller(Device device){
        this.device=device;
    }

    public void turnOn(){
        device.turnOn();
    }

    public void turnOff(){
        device.turnOff();
    }
}