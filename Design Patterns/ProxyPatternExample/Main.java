public class Main {
    public static void main(String[] args) {
        
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("First display of photo1.jpg:");
        image1.display(); 

        System.out.println("\nSecond display of photo1.jpg:");
        image1.display(); 

        System.out.println("\nFirst display of photo2.jpg:");
        image2.display();

        System.out.println("\nSecond display of photo2.jpg:");
        image2.display();
    }
}