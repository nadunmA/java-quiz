import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        TempConvertor t1 = new TempConvertor();
        TempConvertor t2 = new TempConvertor();

        System.out.println("enter T in C : ");
        double c = scanner.nextDouble();

        System.out.println("enter T in F : ");
        double f = scanner.nextDouble();

        double cel = t1.cToF(c);
        double far = t2.fToC(f);

        System.out.println(c + "Celsius is equal to " +cel+ " Faranhite");
        System.out.println(f + "Faranhite is equal to " +far+ " Celsius");

    }
}
