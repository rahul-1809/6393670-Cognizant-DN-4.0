public class InventoryApp {

    public static void main(String[] args){
        InventoryManger manager = new InventoryManger();

        Product p1 = new Product(101, "Laptop", 10, 50000.0);
        Product p2 = new Product(102, "Smartphone", 20, 30000.0);
        Product p3 = new Product(103, "Tablet", 15, 20000.0);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);
        manager.displayInventory();

        System.out.println("\nUpdating product with ID 102:");
        manager.updateProduct(102, 25, 28000.0);
        manager.displayInventory();

        System.out.println("\nDeleting product with ID 101:");
        manager.deleteProduct(101);
        manager.displayInventory();
    }
    
}
