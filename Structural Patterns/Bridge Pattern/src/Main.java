public class Main {

    public static void main(String[] args) {

        Device light = new Light();
        Device thermostat = new Thermostat();
        Device securityCamera = new SecurityCamera();

        Controller mobileController = new MobileController(light);
        Controller voiceController = new VoiceController(thermostat);
        Controller webController = new WebController(securityCamera);

        mobileController.turnOn();
        voiceController.turnOn();
        webController.turnOn();
    }
}