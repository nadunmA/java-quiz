import java.util.Scanner;

public class GreetingValidator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        boolean isValidAge = false;

        while(!isValidAge){

      
        try {
            
            System.out.println("enter name : ");
            String name = scanner.nextLine();

            System.out.println("enter age : ");
            age = Integer.parseInt(scanner.nextLine());

            if(age <= 0 || age > 120){
                throw new InvalidInputException ("Invalid age: Age should be a positive integer less than or equal to 120");
            }

            isValidAge = true;

            System.out.println("Name : " +name+ " age : "+age);

        } catch (InvalidInputException e) {
            
            System.out.println("Error : "+e.getMessage());

        }catch(NumberFormatException e){

            System.out.println("Error : ");

    }
}
}

}
