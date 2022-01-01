import java.util.Scanner;

public class Util {
    public static int getIntVal(String prompt, int min, int max){
        while (true){
            System.out.println(prompt);
            Scanner s= new Scanner(System.in);
            int i= s.nextInt();
            if (i < min || i > max){
                continue;
            }
            return i;
        }
    }
    public static String getStringVal(String prompt, int minLength, int maxLength){
        while (true){
            System.out.println(prompt);
            Scanner s= new Scanner(System.in);
            String str= s.next();
            if (str.length() < minLength || str.length() > maxLength){
                continue;
            }
            return str;
        }
    }
}
