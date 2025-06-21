public class Main {
    public static void main(String[] args) {
        
        Student model = retrieveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        System.out.println("Initial Student Details:");
        controller.updateView();

        System.out.println("\nUpdating student name and grade: ");
        controller.setStudentName("Sai");
        controller.setStudentGrade("A+");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        return new Student("Shiva", "22341A", "B+");
    }
}