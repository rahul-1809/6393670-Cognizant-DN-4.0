public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        
        if (id == 1) {
            return "Shankar";
        } else {
            return "Unknown Customer";
        }
    }
}