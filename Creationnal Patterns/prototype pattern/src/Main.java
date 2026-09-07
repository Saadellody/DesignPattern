//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Enemy prototype = new Enemy(
                "Strong Enemy",
                200,
                5,
                "Shotgun"
        );
        Enemy enemy1 = prototype.clone();
        Enemy enemy2 = prototype.clone();

        enemy1.setHealth(100);
        enemy2.setSpeed(20);

        System.out.println("Prototype:");
        prototype.show();

        System.out.println("Enemy 1:");
        enemy1.show();

        System.out.println("Enemy 2:");
        enemy2.show();
    }
}