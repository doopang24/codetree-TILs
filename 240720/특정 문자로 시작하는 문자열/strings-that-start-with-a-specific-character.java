import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        int cnt = 0, sum = 0;

        for(int i=0; i<n; i++) {
            strArr[i] = sc.next();
        }
        char ch = sc.next().charAt(0);

        for(int i=0; i<n; i++) {
            if(strArr[i].charAt(0)==ch) {
                cnt++;
                sum += strArr[i].length();
            }
        }
        double avr = (double)sum/cnt;
        System.out.printf("%d %.2f", cnt, avr);
    }
}