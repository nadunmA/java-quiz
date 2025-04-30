public class Vehicle {

    private String model;
    private double rentalPricePerDay;

    public Vehicle(String model, double rentalPricePerDay){
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public double calRentalPrice(int days){

        return days * rentalPricePerDay;

    }

}
