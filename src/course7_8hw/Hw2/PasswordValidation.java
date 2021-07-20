package course7_8hw.Hw2;

public class PasswordValidation {
    boolean valid = true;

    public void Password(String pass) {


        if (pass.length() < 12) {
            System.out.println(pass + " Your password should have at least 12 characters");
            valid = false;}

            String upperCaseChars = "(.*[A-Z].*)";
            if (!pass.matches(upperCaseChars)) {
                System.out.println(pass + " Password should contain at least one upper case");
                valid = false;
            }
            String lowerCaseChars = "(.*[a-z].*)";
            if (!pass.matches(lowerCaseChars)) {
                System.out.println(pass + " Password should contain at least one lower case ");
                valid = false;
            }
            String numbers = "(.*[0-9].*)";
            if (!(pass.matches(numbers)&& numbers.length()<3) ){
                System.out.println(pass + " Password should contain at least three numbers.");
                valid = false;

            }
            if (valid)
            {
                System.out.println(pass + " Your password is valid");

}
}
}
