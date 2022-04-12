package userRegistrationday19;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Pattern;
public class UserRegistration {
        Scanner scanner = new Scanner(System.in);

        public void validFirstName(){
                System.out.print("Enter first Name : ");
                String firstName = scanner.next();
                System.out.println(Pattern.matches("^[A-Z]{1}[A-Za-z]{2,}$", firstName));
        }

       
        public  void validLastName(){
            System.out.print("Enter last Name : ");
            String lastName = scanner.next();
            System.out.println(Pattern.matches("^[A-Z]{1}[A-Za-z]{2,}$", lastName));
    }

        public  void validEmail(){
            System.out.print("Enter email : ");
            String email = scanner.next();
            System.out.println(Pattern.matches("^(abc)[.]{1}[A-Za-z]*[@]{1}(bl.co)(.in)*$", email));
    }

        public void validPhoneNumber(){
            System.out.print("Enter phone number : ");
            String phone = scanner.nextLine();
            System.out.println(Pattern.matches("^(91)[\\s]{1}[1-9]{1}[0-9]{9}$", phone));
    }

    public static void main(String[] args) {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validFirstName();
            userRegistration.validLastName();
            userRegistration.validEmail();
            userRegistration.validPhoneNumber();
}


}
