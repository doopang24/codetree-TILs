import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a;

        for(int i=1; i<=N; i++) {
            a = sc.nextInt();
            if(a%2!=0 && a%3==0) {
                System.out.println(a);
            }
        }
    }
}