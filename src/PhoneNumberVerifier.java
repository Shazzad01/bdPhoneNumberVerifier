import java.util.Scanner;
import java.util.regex.*;

public class PhoneNumberVerifier {
    public static boolean isBangladeshiPhoneNumber(String phoneNumber) {
        // Regular expression pattern for Bangladeshi phone numbers
        String regex = "^(?:\\+88|88)?(01[3-9]\\d{8})$";

        // Compile the regular expression pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher with the given phone number
        Matcher matcher = pattern.matcher(phoneNumber);

        // Check if the phone number matches the pattern
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a phone number:");
        String phoneNumber = scanner.nextLine();

        if (isBangladeshiPhoneNumber(phoneNumber)) {
            System.out.println("The entered phone number is a valid Bangladeshi phone number.");
        } else {
            System.out.println("The entered phone number is NOT a valid Bangladeshi phone number.");
        }

        scanner.close();
    }
}
