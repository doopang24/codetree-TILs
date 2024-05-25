import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n, cnt = 0, sum = 0;
        double a;

        while(true) {
            n = sc.nextInt();
            if(n<20 || n>=30) break;
            sum += n;
            cnt++;
        }
        a = (double)sum/cnt;
        System.out.printf("%.2f", a);
    }
}