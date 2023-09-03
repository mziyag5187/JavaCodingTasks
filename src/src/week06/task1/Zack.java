package src.week06.task1;

public class Zack {
    /*
    ========= String_PasswordValidation ============================================
        Write a return method that can verify if a password is valid or not.

        -Requirements:
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper-case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special character
        5. Password should at least contain a digit
        -if all requirements above are met, the method returns true, otherwise returns  false
     */
    public static void main(String[] args) {
        //more than 6 characters
        System.out.println("passwordValidation(\"123445255\") = " + passwordValidation("123445255"));
        //including empty space
        System.out.println("passwordValidation(\"12  4\") = " + passwordValidation("12  4"));
        //with no lowercase letter
        System.out.println("passwordValidation(\"12%4TT\") = " + passwordValidation("12%4TT"));
        //valid
        System.out.println("passwordValidation(\"12%4Tt\") = " + passwordValidation("12%4Tt"));
    }

    /**
     * verifies if a password is valid or not based on our requirements
     * @param password - the given String from user as a password
     * @return boolean
     */
    public static boolean passwordValidation(String password) {
        String lowerCase="(.*[a-z].*)";
        String upperCase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialChars="(.*[ -/, :-@].*)";

        boolean hasLower = password.matches(lowerCase),
                hasUpper = password.matches(upperCase),
                hasDigits = password.matches(numbers),
                hasSpecial = password.matches(specialChars),
                valid = false;

        if(password.length() >= 6 && !password.contains(" "))
            if( hasLower && hasUpper && hasDigits && hasSpecial)
                valid = true;

        return valid;
    }

}
