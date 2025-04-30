
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        TempCon t1 = new TempCon();
        TempCon t2 = new TempCon();

        System.out.println("enter the tempp in celcisus : ");
        double c = sc.nextDouble(); 
        System.out.println("faranhite : ");
        double f = sc.nextDouble();

        double cf = t1.celciusToFarnhite(c);
        double fc = t2.faranhiteToCelsious(f);

        System.out.println(c+"c is e to "+cf+" f");
        System.out.println(f+"f is e to "+fc+" c");

        
    }
}
