package src.week06.task1;

public class irem {

    public static void main(String[] args) {
        System.out.println(validPassword("CydeoSchool12!"));
        System.out.println(validPassword("CydeoSchool12"));
    }


    /**
     *  Write a return method that can verify if a password is valid or not
     * parameter: password
     * return: boolean
     */

    public static boolean validPassword(String password){
        boolean validation = false;

        char[] ch = password.toCharArray();
        int upperCase =0;
        int lowerCase = 0;
        int special = 0;
        int digit = 0;

        for (int i = 0; i < ch.length; i++) {

            char c = ch[i];
            if(Character.isUpperCase(c)){
                upperCase++;
            }
            if(Character.isLowerCase(c)){
                lowerCase++;
            }
            if(Character.isDigit(c)){
                digit++;
            }
            if(!Character.isLetterOrDigit(c)){
                special++;
            }
        }

        if(ch.length>=6 && upperCase>=1 && lowerCase>=1 && special>=1 && digit>=1){
            validation = true;
        }

        return validation;
    }

}
/*
1️⃣  String_PasswordValidation
1. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false
 */

