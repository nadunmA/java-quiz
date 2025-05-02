package Student;

public class Student {
	
	private int id;
	private String name;
	private int mark;
	
	public Student() {
		id = 0000;
		name = "default";
		mark = 0;
	}

	public Student(int id, String name, int mark) {
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	
	
	public int getMark() {
		return mark;
	}

	public String toString() {
		
		return "Id : " + id + "\nname : " + name + "\nmark : " + mark;
		
	}
	
	

}
