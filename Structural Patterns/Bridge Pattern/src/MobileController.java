public class MobileController extends Controller{


    public  MobileController(Device device){
        super(device);
    }

    public void down(){
        device.turnOff();
    }

    public void up(){
        device.turnOn();
    }
}
