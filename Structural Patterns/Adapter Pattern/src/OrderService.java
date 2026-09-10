public class OrderService {

    private NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void orderCreated(String clientPhone) {

        notificationService.send(
                clientPhone,
                "Votre commande a été créée."
        );
    }
    }
}