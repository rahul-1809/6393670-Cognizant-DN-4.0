public class Main{
    public static void main(String[] args){

        Computer nrmlComputer = new Computer.Builder("Intel i5", 8)
                .storage("512GB SSD")
                .hasGraphicsCard(true)
                .build();

        Computer gamingComputer = new Computer.Builder("AMD Ryzen 7", 16)
                .storage("1TB SSD")
                .hasGraphicsCard(true)
                .build();
        
        Computer officeComputer = new Computer.Builder("Intel i3", 4)
                .storage("256GB SSD")
                .hasGraphicsCard(false)
                .build();

        System.out.println("Normal Computer: " + nrmlComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println(officeComputer);
    } 
}