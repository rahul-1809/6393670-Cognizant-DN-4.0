public class TaskManager{
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Task added: " + task.taskName);
    }

    public Task searchTask(int id) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.taskId == id) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public void deleteTask(int id) {
        if (head == null) {
            System.out.println("No tasks to delete.");
            return;
        }

        if (head.task.taskId == id) {
            head = head.next;
            System.out.println("Task with ID " + id + " deleted.");
            return;
        }

        TaskNode current = head;
        while (current.next != null && current.next.task.taskId != id) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task with ID " + id + " not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Task with ID " + id + " deleted.");
        }
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Add tasks
        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Build API", "In Progress"));
        manager.addTask(new Task(3, "Write Tests", "Pending"));

        System.out.println("\nAll Tasks:");
        manager.traverseTasks();

        // Search task
        System.out.println("\nSearching Task ID 2:");
        Task found = manager.searchTask(2);
        if (found != null)
            System.out.println(found);
        else
            System.out.println("Task not found.");

        // Delete task
        System.out.println("\nDeleting Task ID 1:");
        manager.deleteTask(1);

        System.out.println("\nTasks after deletion:");
        manager.traverseTasks();
    }
}