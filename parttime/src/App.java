public class App {
    public static void main(String[] args) throws Exception {
        
        Part p1 = new Part("alice", 111111, 2);
        Part p2 = new Part("err", 44444, 3);

        p1.displayEmo();
        System.out.println();
        p2.displayEmo();


    }
}
