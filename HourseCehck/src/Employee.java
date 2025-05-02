public class Employee {

    private int id;
    private String name;
    private int hourse;

    Employee(){

        id = 0;
        name = "";
        hourse = 0;

    }

    Employee(int id, String name, int hourse){

        this.id = id;
        this.name = name;
        this.hourse = hourse;

    }

    public int getHourse(){
        return hourse;
    }

    public String toString(){

        return "id : " + id + "name : " + name + "hourse : " + hourse;

    }


}
