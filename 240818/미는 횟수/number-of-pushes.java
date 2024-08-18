import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int a = A.length();
        String B = sc.next();
        int cnt = 0;

        for(int i=0; i<=A.length(); i++) {
            A = A.substring(a-1) + A.substring(0,a-1);
            cnt++;
            if(A.equals(B)) break;
        }

        if(cnt==7) System.out.print(-1);
        else System.out.print(cnt);
    }
}