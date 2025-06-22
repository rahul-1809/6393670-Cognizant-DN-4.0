import java.util.HashMap;
import java.util.Map;

public class InventoryManger {
    private Map<Integer, Product> inventory;

    public InventoryManger(){
        inventory = new HashMap<>();
    }

    public void addProduct(Product product){
        int id = product.getProductId();
        if(inventory.containsKey(id)){
            System.out.println("Product with id " + id + " already exists");
        }
        else{
            inventory.put(id, product);
            System.out.println("Product added.");
        }
    }

    public void updateProduct(int productId, int newQuantity, double newPrice){
        Product product = inventory.get(productId);
        if(product != null){
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Product updated.");
        }
        else{
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void deleteProduct(int productId){
        if(inventory.remove(productId) != null){
            System.out.println("Product deleted.");
        }
        else{
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void displayInventory(){
        if(inventory.isEmpty()){
            System.out.println("Inventory is empty.");
        }
        else{
            System.out.println("Current Inventory:");
            for(Product product : inventory.values()){
                product.display();
            }
        }
    }
}
