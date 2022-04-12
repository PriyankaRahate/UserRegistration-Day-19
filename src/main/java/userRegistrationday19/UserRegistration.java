package userRegistrationday19;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
        Scanner scanner = new Scanner(System.in);

        public void validFirstName(){
                System.out.print("Enter first Name : ");
                String firstName = scanner.nextLine();
                System.out.println(Pattern.matches("^[A-Z]{1}[A-Za-z]{2,}$", firstName));
        }

        public  void validLastName(){
                System.out.print("Enter last Name : ");
                String lastName = scanner.nextLine();
                System.out.println(Pattern.matches("^[A-Z]{1}[A-Za-z]{2,}$", lastName));
        }

        public  void validEmail(String[] email){
                for(int i = 0; i< email.length; i++ ){
                        System.out.print(Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email[i]) + " ");
                }
        }

        public void validPhoneNumber(){
                System.out.print("Enter phone number : ");
                String phone = scanner.nextLine();
                System.out.println(Pattern.matches("^(91)[\\s]{1}[1-9]{1}[0-9]{9}$", phone));
        }

        public void validPassword(){
                System.out.print("Enter password : ");
                String password = scanner.nextLine();
                System.out.println(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=[^@#!$%^&+=]*[@#!$%^&+=][^@#!$%^&+=]*$)(?=.*[0-9]).{8,}$", password));
        }

        public static void main(String[] args) {
                String[] validEmailSample = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
                String[] invalidEmailSample = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

                UserRegistration userRegistration = new UserRegistration();
                System.out.println("Valid email :");
                userRegistration.validEmail(validEmailSample);
                System.out.println("\nInvalid emails :");
                userRegistration.validEmail(invalidEmailSample);
    }
}