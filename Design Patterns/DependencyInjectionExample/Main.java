public class Main {
    public static void main(String[] args) {

        CustomerRepository repository = new CustomerRepositoryImpl();

        CustomerService service = new CustomerService(repository);

        System.out.println("Fetching customer with ID 1:");
        String customerName = service.getCustomerName(1);
        System.out.println("Customer Name: " + customerName);

        System.out.println("\nFetching customer with ID 10:");
        String unknownCustomer = service.getCustomerName(10);
        System.out.println("Customer Name: " + unknownCustomer);
    }
}