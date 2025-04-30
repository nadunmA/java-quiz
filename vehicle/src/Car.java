public class Car extends Vehicle{

    private int seats;
    
    public Car(String model, double rentalPricePerDay, int seats){
        super(model, rentalPricePerDay);
        this.seats = seats;
    }

}
