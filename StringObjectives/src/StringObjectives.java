import java.util.Stack;

public class StringObjectives {

    public static StringBuffer ReverseString(String input){

        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()){

            stack.push(c);

        }
        
        StringBuffer builder = new StringBuffer();

        builder.append(stack);

        return builder.reverse();

    }

    public static int countVowels(String input){

        Stack<Character> stack = new Stack<>();

        int count = 0;

        for(char c : input.toLowerCase().toCharArray()){
            stack.push(c);
        }

        while(!stack.isEmpty()){

            char c = stack.pop();

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }

        }

        return count;
        

    }

}
