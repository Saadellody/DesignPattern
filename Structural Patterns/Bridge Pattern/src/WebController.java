public class WebController extends Controller{


    public WebController(Device device){
        super(device);
    }

    public void down(){
        device.turnOff();
    }

    public void up(){
        device.turnOn();
    }
}
