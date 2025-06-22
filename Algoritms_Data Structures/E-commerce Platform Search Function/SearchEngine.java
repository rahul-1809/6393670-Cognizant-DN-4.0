import java.util.Arrays;
import java.util.Comparator;

public class SearchEngine{

    // Linear Search
    public static Product linearSearch(Product[] products, String targetName){
        for(Product product : products){
            if(product.productName.equalsIgnoreCase(targetName)){
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] sortedProducts, String targetName){

        int low = 0, high = sortedProducts.length - 1;

        while(low <= high){
            int mid = (low + high)/2;
            int compare = sortedProducts[mid].productName.compareToIgnoreCase(targetName);

            if(compare == 0){
                return sortedProducts[mid];
            } else if(compare < 0){
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return null;
    }
    public static void main(String[] args){
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Smartphone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Book", "Stationery")
        };

        String searchName1 = "Watch";
        Product result1 = linearSearch(products, searchName1);
        System.out.println("Linear Search Result:");
        System.out.println(result1 != null ? result1 : "Product not found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        String searchName2 = "Laptop";
        Product result2 = binarySearch(products, searchName2);
        System.out.println("\nBinary Search Result:");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}