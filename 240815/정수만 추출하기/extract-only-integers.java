import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String a = "", b = "";

        for(int i=0; i<A.length(); i++) {
            if('0'<=A.charAt(i) && A.charAt(i)<='9') {
                a += A.charAt(i);
            } else {
                break;
            }
        }

        for(int i=0; i<B.length(); i++) {
            if('0'<=B.charAt(i) && B.charAt(i)<='9') {
                b += B.charAt(i);
            } else {
                break;
            }
        }

        System.out.print(Integer.parseInt(a) + Integer.parseInt(b));
    }
}