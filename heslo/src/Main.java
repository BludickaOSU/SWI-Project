import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int attempts = 4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Heslo musí obsahovat alespoň 10 znaků, velká, málá písmena a alespoň jedno číslo.");
        System.out.print("Zadejte heslo: ");
        while(attempts>=0) {


            String password = scan.next();
            if (checkString(password) && validPassword(password)){
                System.out.println("Úspěšně jste zadali heslo");
                attempts = 0;
            }
            else {
                attempts--;
                if (attempts==0){
                    System.out.println("Zkuste to znovu. ");
                }
                else {
                    badPassword();
                    System.out.println("Počet pokusu: "+(attempts));
                }


            }





            }
        }

    public static void badPassword(){
        System.out.print("Heslo které jste zadali nesplňuje některý z požadavků"+"\n"+"Zadejte heslo: ");

    }
    private static boolean checkString(String str) {
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;

        for(int i=0;i < str.length();i++) {
            ch = str.charAt(i);
            if( Character.isDigit(ch)) {
                numberFlag = true;
            }
            else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }

            if(numberFlag && capitalFlag && lowerCaseFlag)
                return true;
        }
        return false;
    }
    public static boolean validPassword(String password){
        if (password.length() >10) {
            return true;
        }
        else {
            return false;
        }
    }


}
