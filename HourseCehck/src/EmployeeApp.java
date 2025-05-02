import java.util.PriorityQueue;

public class EmployeeApp {

    public static void main(String[] args) {
        
        PriorityQueue<Employee> pq = new PriorityQueue<>();

        pq.add(new Employee(111, "Nadun", 8));
        pq.add(new Employee(222, "Nadun", 12));
        pq.add(new Employee(333, "Nadun", 4));
        pq.add(new Employee(444, "Nadun", 20));
        pq.add(new Employee(555, "Nadun", 2));

        System.out.println("\n all emaplyee details");
        PriorityQueue<Employee> copyPq = new PriorityQueue<>();
        while(!copyPq.isEmpty()){
            System.out.println(pq.poll());
        }

        PriorityQueue<Employee> highPq = new PriorityQueue<>();
        for(Employee emp : pq){
            if(emp.getHourse() > 15){
                highPq.offer(emp);
            }
        }

        System.out.println("\nemployee with hourse > 15");
        while(!highPq.isEmpty()){
            System.out.println(highPq.poll());
        }
    }


}

