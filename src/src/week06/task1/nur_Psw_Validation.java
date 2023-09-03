package src.week06.task1;

public class nur_Psw_Validation {
    public static void main(String[] args) {
        System.out.println(validPsw("Hus1tuiT"));

    }

    public static boolean validPsw(String password) {
        boolean validation = false;

        char[] ch = password.toCharArray();
        int countUpper = 0;
        int countLower = 0;
        int special = 0;
        int Digit = 0;
        boolean space = !password.contains(" ");
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];

            if (Character.isDigit(c)) {
                Digit++;
            }
            if (Character.isUpperCase(c)) {
                countUpper++;
            }
            if (Character.isLowerCase(c)) {
                countLower++;
            }
            if (!Character.isLetterOrDigit(c)) {
                special++;
            }

        }

        if(space && countUpper>=1 && countLower>=1 && Digit>=1 && special>=1 && ch.length>=6){
            validation= true;
        }
        return validation;


    }


}
/*

1️⃣  __**String_PasswordValidation**__
```1. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false```

 */