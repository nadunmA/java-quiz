public class TempConvertor {

    private double temp;
    
    public TempConvertor(){

        this.temp = 0;

    }

    public double getTemp(){

        return temp;

    }

    public double cToF(double celsius){

        return (celsius * 9.0 / 5.0) + 32.0;

    }

    public double fToC(double franhite){

        return (franhite - 32.0) * 5.0 / 9.0;

    }



}
