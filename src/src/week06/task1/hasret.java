package src.week06.task1;

public class hasret {

    /*
    String_PasswordValidation
1. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false

     */


    public static void main(String[] args) {

        String myPassword = "Hb1234!";
        String secondPassword = "123456";
        String thirdPassword = "Hb12346789.";
        String fourthPassword = "Hb12346789";

        System.out.println(String_PasswordValidation(myPassword));
        System.out.println(String_PasswordValidation(secondPassword));
        System.out.println(String_PasswordValidation(thirdPassword));
        System.out.println(String_PasswordValidation(fourthPassword));


    }


    /**
     * This method checks the credentials to verify password is valid or not.
     * @param password
     * @return
     */


    public static boolean String_PasswordValidation(String password) {

        boolean validPassword = false;
        boolean valid1 = false;
        boolean valid2 = false;
        boolean valid3 = false;
        boolean valid4 = false;

        char[] ch = password.toCharArray();

        if(password.length() >= 6 && !password.contains(" ")){

            for (char each : ch) {
                if(Character.isDigit(each)){
                    valid1 = true;
                }else if(Character.isUpperCase(each)){
                    valid2 = true;
                }else if(Character.isLowerCase(each)){
                    valid3 = true;
                } else if (!Character.isLetterOrDigit(each)) {
                    valid4 = true;
                }
            }

        }

        if (valid1 == true && valid2 == true && valid3 == true && valid4 == true){
            validPassword = true;
        }

        return validPassword;

    }

}





