public class Employee {

    private String name;
    protected double salary;

    public Employee(String name, double salary){

        this.name = name;
        this.salary = salary;
    }

    public void display(){
        System.out.println(name);
        System.out.println(salary);
    }

}
