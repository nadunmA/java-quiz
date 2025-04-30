import java.util.Scanner;

public class MathOperation {

    public void drawMultiplication(int num, int range){

        for(int i=1; i<=range; i++){
            System.out.println(num+" x "+ i + " = "+(num * i));
        }

    }

    public int factorial(){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter positive integer : ");
        int n = sc.nextInt();

        if( n<0){
            System.out.println("invalid");
            return -1;
        }

        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }

        return fact;

    }

}
