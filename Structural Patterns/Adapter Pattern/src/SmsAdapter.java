public class SmsAdapter implements NotificationService{

     ExternalSmsProvider externalSmsProvider;

    public SmsAdapter(ExternalSmsProvider externalSmsProvider) {
        this.externalSmsProvider = externalSmsProvider;
    }

    @Override
    public void send(String recipent , String message){
        externalSmsProvider.sendSMS(recipent, message);
    }
}
