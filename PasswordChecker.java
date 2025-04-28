import java.util.*;

class PasswordChecker {
    Scanner sc = new Scanner(System.in);

    // User must enter the correct password to continue
    void verifyPassword() {
        String correctPassword = "open123"; // the correct password
        String inputPassword; // guard variable

        System.out.println("Enter the password to access:");

        inputPassword = sc.next(); // set guard variable

        while (!correctPassword.equals(inputPassword)) { // check guard variable
            System.out.println("Incorrect password. Try again:");
            inputPassword = sc.next(); // update guard variable
        }

        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        PasswordChecker pc = new PasswordChecker();
        pc.verifyPassword(); // call the method
    }
}