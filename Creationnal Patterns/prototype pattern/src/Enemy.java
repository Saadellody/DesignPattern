public class Enemy implements Prototype<Enemy> {

    private String name;
    private int health ;
    private int speed ;
    private String weapon;


    @Override
    public Enemy clone(){
        return new Enemy(this.name,this.health,this.speed,this.weapon);
    }
    public Enemy(String name, int health, int speed, String weapon) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void show(){
        System.out.println(name+" "+health +" "+ speed+ " "+weapon);
    }
}
