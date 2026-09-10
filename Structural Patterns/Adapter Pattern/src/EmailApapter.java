import javax.print.DocFlavor;

public class EmailApapter implements NotificationService{

    ExternalEmailProvider externalEmailProvider;
    String subject;

     public EmailApapter(ExternalEmailProvider externalEmailProvider,String subject){
         this.externalEmailProvider=externalEmailProvider;
         this.subject=subject;
     }

     @Override
    public void send(String recipent, String message){
         externalEmailProvider.sendEmail(recipent,subject,message);
     }
}
