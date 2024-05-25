import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sumVal = 0, a, cnt = 0;
        double ave = 0.0;

        for(int i=0; i<10; i++) {
            a = sc.nextInt();
            if(0<=a && a<=200) {
                sumVal += a;
                cnt++;
            }
        }
        ave = (double)sumVal/cnt;

        System.out.printf("%d %.1f", sumVal, ave);
    }
}