public class Part extends Employee{

    private int othour;

    public Part(String name, double salary, int othour){
        super(name, salary);
        this.othour = othour;
    }

    public void displayEmo(){
        super.display();
        System.out.println(othour);
    }

}
