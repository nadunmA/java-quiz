import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Telephone Number : ");
        String tele = sc.nextLine();

        try {

            if (tele.length() != 10) {
                throw new InvalidPhoneNumberDigits();
            }

            if (tele.charAt(0) != '0') {
                throw new InvalidPhoneNumberStart();
            }

            System.out.println("phone number is valid : " + tele);

        } catch (InvalidPhoneNumberDigits e) {

            System.out.println(e.getMessage());

        } catch (InvalidPhoneNumberStart e) {

            System.out.println(e.getMessage());
        }

        sc.close();

    }
}
