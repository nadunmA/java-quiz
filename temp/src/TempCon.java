public class TempCon {

    private double temp;

    public TempCon(){
        this.temp = 0;
    }

    public double setTemp(){
        return temp;
    }

    public double celciusToFarnhite(double celcisus){
        return (celcisus * 9/5) +32;
    } 

    public double faranhiteToCelsious(double franhite){

        return (franhite - 32)*5/9;

    }

}
