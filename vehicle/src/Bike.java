public class Bike extends Vehicle{

    private int eCapacity;

    public Bike(String model, double rentalPricePerDay, int eCapacity){
        super(model, rentalPricePerDay);
        this.eCapacity = eCapacity;
    }

}
