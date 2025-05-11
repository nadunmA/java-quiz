import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {
        PriorityQueue<Employee> employeeQueue = new PriorityQueue<>();


        employeeQueue.add(new Employee(101, "Alice", 10));
        employeeQueue.add(new Employee(102, "Bob", 20));
        employeeQueue.add(new Employee(103, "Charlie", 25));
        employeeQueue.add(new Employee(104, "Diana", 12));
        employeeQueue.add(new Employee(105, "Ethan", 18));

        System.out.println("All Employees in PriorityQueue:");
        for (Employee emp : employeeQueue) {
            System.out.println(emp);
        }

   
        PriorityQueue<Employee> highHoursQueue = new PriorityQueue<>();
        while (!employeeQueue.isEmpty()) {
            Employee emp = employeeQueue.poll();
            if (emp.getHours() > 15) {
                highHoursQueue.add(emp);
            }
        }

        System.out.println("\nEmployees with hours > 15:");
        for (Employee emp : highHoursQueue) {
            System.out.println(emp);
        }
    }
}
