package userRegistrationday19;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
        Scanner scanner = new Scanner(System.in);

        public void validFirstName(){
                System.out.print("Enter first Name : ");
                String firstName = scanner.next();
                System.out.println(Pattern.matches("^[A-Z]{1}[A-Za-z]{2,}$", firstName));
        }

        public static void main(String[] args) {
                UserRegistration userRegistration = new UserRegistration();
                userRegistration.validFirstName();
    }
}