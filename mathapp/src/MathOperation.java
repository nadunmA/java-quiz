import java.util.Scanner;

public class MathOperation {

    public void drawMultiplicationTable(int num, int range){

        System.out.println(+ num + "up to " + range);
        for(int i=1; i<=range; i++){
            System.out.println(num + " x "+ i + " = " + (num * i));
        }

    }

    public int factorial(){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter positive cal factorial : ");
        int n = sc.nextInt();

        int fact = 1;

        for(int i=1; i<=n; i++){
            fact *= i;
        }

        return fact;

        

    }

}
