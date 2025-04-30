public class App {
    public static void main(String[] args) throws Exception {
        
        MathOperation m = new MathOperation();

        m.drawMultiplicationTable(5, 10);

        int result = m.factorial();
        System.out.print("factorial result : "+result);

    }
}
