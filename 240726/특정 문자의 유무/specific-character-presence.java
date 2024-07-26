import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean check = false;

        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i)=='e' && str.charAt(i+1)=='e') check = true;
        }
        if(check) System.out.print("Yes ");
        else System.out.print("No ");

        check = false;
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i)=='a' && str.charAt(i+1)=='b') check = true;
        }
        if(check) System.out.print("Yes ");
        else System.out.print("No ");
    }
}