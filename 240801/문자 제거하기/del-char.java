import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        while(str.length()>1) {
            int n = sc.nextInt();
            if(n<str.length() && n>0) {
                str = str.substring(0,n) + str.substring(n+1,str.length());
                System.out.println(str);
            } else if(n>=str.length()) {
                str = str.substring(0,str.length()-1);
                System.out.println(str);
            } else if(n==0) {
                str = str.substring(1,str.length());
                System.out.println(str);
            }
        }
    }
}