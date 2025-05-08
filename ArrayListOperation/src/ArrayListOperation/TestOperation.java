package ArrayListOperation;
import java.util.ArrayList;
import java.util.Scanner;

public class TestOperation {

	public static void main(String[] args) {
		
		ArrayList<Integer> testArr = new ArrayList<>();
		
		Scanner scaneer = new Scanner(System.in);
		
		System.out.println("Enter 5 integer values : ");
		for(int i=0; i < 5; i++) {
			
			testArr.add(scaneer.nextInt());
			
		}
		
		System.out.println("Values : "+testArr);
		
		System.out.println("\nAfter removing odd numbers:");
		ArrayListOperation.removeOddNumber(testArr);
		
		System.out.println("\nAfter doubling even numbers:");
		ArrayListOperation.doubleEvenNumber(testArr);
		
	}
	
}
