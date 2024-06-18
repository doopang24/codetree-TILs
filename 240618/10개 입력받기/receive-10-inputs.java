import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n, cnt = 0, sum = 0;
        double avr;

        for(int i=0; i<10; i++) {
            n = sc.nextInt();
            if(n==0) break;
            sum += n;
            cnt++;
        }
        avr = (double)sum/cnt;
        System.out.print(sum+" ");
        System.out.printf("%.1f",avr);
    }
}