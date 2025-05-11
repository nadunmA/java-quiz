public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int hours;

    // Default constructor
    public Employee() {
        this.id = 0;
        this.name = "Unknown";
        this.hours = 0;
    }

    // Overloaded constructor
    public Employee(int id, String name, int hours) {
        this.id = id;
        this.name = name;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.hours, other.hours);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Hours: " + hours;
    }
}
