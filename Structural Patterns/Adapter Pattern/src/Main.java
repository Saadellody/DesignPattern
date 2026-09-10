//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


      ExternalSmsProvider smsProvider= new ExternalSmsProvider();

      SmsAdapter smsAdapter = new SmsAdapter(smsProvider);

      OrderService orderService= new OrderService(smsAdapter);

      orderService.orderCreated("0659354715");



      // mail

        ExternalEmailProvider  externalEmailProvider= new ExternalEmailProvider();

        EmailApapter emailApapter= new EmailApapter(externalEmailProvider,"voila object");

        OrderService orderService1 = new OrderService(emailApapter);

        orderService1.orderCreated("\"client@gmail.com\"");
    }
}