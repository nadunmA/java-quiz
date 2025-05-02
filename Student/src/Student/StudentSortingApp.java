package Student;
import java.util.ArrayList;

public class StudentSortingApp {
	
	 public static void main(String[] args) {
		 
		 ArrayList<Student> student = new ArrayList<>();
		 
		 student.add(new Student(111,"nadun", 45));
		 student.add(new Student(222,"nadun", 60));
		 student.add(new Student(333,"nadun", 30));
		 student.add(new Student(444,"nadun", 55));
		 student.add(new Student(555,"nadun", 25));
		 
		 for(int i=0; i< student.size(); i++) {
			 
			 if(student.get(i).getMark() > 50) {
				 
				 student.remove(i);
				 i--;
				 
			 }
			 
		 }
		 
		 System.out.println("student remove marks <= 50\n");
		 
		 for(Student s : student) {
			 System.out.println();
			 System.out.println(s);
		 }
		 
	 }
	 
	
}
