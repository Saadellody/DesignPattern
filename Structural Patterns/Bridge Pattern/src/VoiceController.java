public class VoiceController extends Controller{


    public VoiceController(Device device){
        super(device);
    }

    public void down(){
        device.turnOff();
    }

    public void up(){
        device.turnOn();
    }
}
