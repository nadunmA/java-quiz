public class App {
    public static void main(String[] args) throws Exception {
        
        Car c1 = new Car("d", 50, 4);
        Bike b1 = new Bike("v", 30, 2);

        int rent = 3;

        double d1 = c1.calRentalPrice(rent);
        double d2 = b1.calRentalPrice(rent);

        System.out.println("days : "+rent+" cost : "+d1);
        System.out.println("days : "+rent+" cost : "+d2);

    }
}
