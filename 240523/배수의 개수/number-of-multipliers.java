import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n,cnt1=0,cnt2=0;

        for(int i=0; i<10; i++) {
            n = sc.nextInt();
            if(n%3==0) cnt1++;
            if(n%5==0) cnt2++;
        }
        System.out.print(cnt1+" ");
        System.out.print(cnt2+" ");
    }
}