package ArrayListOperation;
import java.util.ArrayList;

public class ArrayListOperation {
	
	public static void removeOddNumber(ArrayList<Integer> numbers) {
		
		numbers.removeIf(n -> n %2 != 0);
		System.out.println("Remaining Numbers : "+numbers);
		
	}
	
	public static void doubleEvenNumber(ArrayList<Integer> numbers) {
		
		ArrayList <Integer> newNum = new ArrayList<>();
		
		for(int num : numbers) {
			
			if(num %2 == 0) {
				
				int doubleNumber = num * 2;
				newNum.add(doubleNumber);
			}
			
		}
		
		System.out.println("New values : "+newNum);
		
	}
	

}
