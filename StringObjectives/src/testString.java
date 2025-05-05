import java.util.Scanner;

public class testString {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter word : ");
        String word = scanner.nextLine();

        StringBuffer reversed = StringObjectives.ReverseString(word);
        int vowelCount = StringObjectives.countVowels(word);

        System.out.println("Word in reverse : "+reversed);
        System.out.println("Vowel Count : "+vowelCount);

    }

}
