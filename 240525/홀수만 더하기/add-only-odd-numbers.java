import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, sumVal = 0;

        for(int i=0; i<n; i++) {
            a = sc.nextInt();
            if(a%2==1 && a%3==0) {
                sumVal += a;
            }
        }
        System.out.print(sumVal);
    }
}