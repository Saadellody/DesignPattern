public class ExternalSmsProvider {

    public void sendSMS(String phoneNumber, String text){
        System.out.println("SMS envoyé à " + phoneNumber + " : " + text
        );
    }
}
