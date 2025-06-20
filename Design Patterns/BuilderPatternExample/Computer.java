public class Computer{
    private final String cpu;
    private final int ram;
    private final String storage;
    private final boolean hasGraphicsCard;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
    }

    @Override
    public String toString(){
        return "Computer [CPU = " + cpu + ", RAM = " + ram + "GB, Storage = " + storage + ", Has Graphics Card = " + (hasGraphicsCard ? "Yes" : "No") + "]";
    }

    public static class Builder{

        private final String cpu;
        private final int ram;
        private String storage = "256GB SSD";
        private boolean hasGraphicsCard = false;
        
        public Builder(String cpu, int ram){
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(String storage){
            this.storage = storage;
            return this;
        }

        public Builder hasGraphicsCard(boolean hasGraphicsCard){
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
    
}