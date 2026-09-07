public class Computer {

    private String processeur;
    private int ram;
    private int storage;
    private String graphieCard;
    private boolean wifi;
//    private boolean bluetooth;
//    private String operatingSystem;


    private  Computer(Builder builder) {
        this.processeur = builder.processeur;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphieCard = builder.graphieCard;
        this.wifi = builder.wifi;
    }


    public static class Builder {

        private String processeur;
        private int ram;
        private int storage;
        private String graphieCard;
        private boolean wifi;
//    private boolean bluetooth;
//    private String operatingSystem;

        public Builder processeur(String processeur){
            this.processeur=processeur;
            return this;
        }

        public  Builder ram(int ram ){
            this.ram=ram;
            return this ;
        }

        public Builder storage(int storage){
            this.storage=storage;
            return this;
        }

        public Builder wifi(boolean wifi){
            this.wifi=wifi;
            return this;
        }


        public Computer build(){
            return new Computer(this);
        }
    }


}

