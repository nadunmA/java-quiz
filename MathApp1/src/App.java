public class App {
    public static void main(String[] args) throws Exception {
        
        MathOperation mo = new MathOperation();

        mo.drawMultiplication(5,10);
    
        int result = mo.factorial();
    
        if(result != -1){
            System.out.println("Factorial : " +result);
        }
    }
}
