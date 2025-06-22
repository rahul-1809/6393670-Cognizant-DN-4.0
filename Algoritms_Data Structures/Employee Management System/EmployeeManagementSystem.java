public class EmployeeManagementSystem{
    private static final int MAX_EMPLOYEES = 100;
    private Employee[] employees = new Employee[MAX_EMPLOYEES];
    private int count = 0;

    public void addEmployee(Employee emp){
        if(count < MAX_EMPLOYEES) {
            employees[count++] = emp;
            System.out.println("Employee added: " + emp.name);
        } else {
            System.out.println("Employee limit reached. Cannot add more employees.");
        }
    }

    public Employee searchEmployee(int id){
        for(int i=0; i<count; i++){
            if(employees[i].employeeId == id){
                return employees[i];
            }
        }
        return null;
    }

    public void deleteEmployee(int id){
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                found = true;
                
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee with ID " + id + " deleted.");
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public void traverseEmployees(){
        if(count == 0) {
            System.out.println("No employees to display.");
            return;
        }
        for(int i=0; i<count; i++){
            System.out.println(employees[i]);
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        system.addEmployee(new Employee(101, "Rishi", "Developer", 50000));
        system.addEmployee(new Employee(102, "Sneha", "Designer", 45000));
        system.addEmployee(new Employee(103, "Karna", "Manager", 65000));

        System.out.println("\nAll Employees:");
        system.traverseEmployees();

        System.out.println("\nSearching Employee with ID 102:");
        Employee e = system.searchEmployee(102);
        if (e != null) System.out.println(e);
        else System.out.println("Employee not found.");

        System.out.println("\nDeleting Employee with ID 101:");
        system.deleteEmployee(101);

        System.out.println("\nEmployees after deletion:");
        system.traverseEmployees();
    }

}