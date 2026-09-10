public class ExternalEmailProvider {

    public void sendEmail(
            String emailAddress,
            String subject,
            String content
    ) {
        System.out.println(
                "Email envoyé à " + emailAddress
        );
    }
}
