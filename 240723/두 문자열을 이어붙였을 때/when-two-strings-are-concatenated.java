import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String str3 = str1+str2;
        String str4 = str2+str1;

        if(str3.equals(str4)) System.out.println("true");
        else System.out.println("false");
    }
}