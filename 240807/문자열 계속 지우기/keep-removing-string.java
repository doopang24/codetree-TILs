import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int b = B.length();

        while(A.contains(B)) {
            for(int i=0; i<A.length()-b; i++) {
                if(A.substring(i,i+b).equals(B)) {
                    A = A.substring(0,i) + A.substring(i+b,A.length());
                    break;
                } 
            }
        }
        System.out.print(A);
    }
}