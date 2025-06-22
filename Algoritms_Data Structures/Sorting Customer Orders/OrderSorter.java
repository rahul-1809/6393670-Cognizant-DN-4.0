public class OrderSorter{
    // Bubble Sort
    public static void bubbleSort(Order[] orders){
        int n = orders.length;
        for(int i=0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(orders[j].totalPrice > orders[j+1].totalPrice){
                    Order temp = orders[j];
                    orders[j] = orders[j+1];    
                    orders[j+1] = temp;
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(Order[] orders, int low, int high){
        if(low < high){
            int pi = partition(orders, low , high);
            quickSort(orders, low, pi-1);
            quickSort(orders, pi+1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high){
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for(int j = low; j<high; j++){
            if(orders[j].totalPrice <= pivot){
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];  
                orders[j] = temp;
            }
        }
        Order temp = orders[i+1];
        orders[i+1] = orders[high];
        orders[high] = temp;
        return i+1;
    }

    public static void printOrders(Order[] orders){
        for(Order order : orders){
            System.out.println(order);
        }
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Shiva", 1500.25),
            new Order(102, "Ravi", 1200.75),
            new Order(103, "Karna", 2000.50),
            new Order(104, "Arjuna", 800.00),
            new Order(105, "Sai", 1750.00)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        // Bubble Sort
        bubbleSort(orders);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        printOrders(orders);

        Order[] orders2 = {
            new Order(201, "Shankar", 1800.00),
            new Order(202, "Lakshmi", 2200.00),
            new Order(203, "Gita", 1600.00),
            new Order(204, "Sita", 1400.00),
            new Order(205, "Radha", 1900.00)
        };

        System.out.println("\nOriginal Orders:");
        printOrders(orders2);

        // Quick Sort
        quickSort(orders2, 0, orders2.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        printOrders(orders2);
    }

}