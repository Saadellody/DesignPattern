public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection(){
        System.out.println("the connexion with database start successuflly");
    }

    public static DatabaseConnection getInstance(){
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
