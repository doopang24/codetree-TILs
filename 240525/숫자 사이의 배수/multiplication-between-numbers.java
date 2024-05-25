import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sumVal = 0;
        double aveVal, cnt = 0.0;

        for(int i=a; i<=b; i++) {
            if(i%5==0 || i%7==0) {
                sumVal += i;
                cnt++;
            }
        }
        aveVal = (Math.round((sumVal/cnt)*10))/10.0;

        System.out.print(sumVal+" ");
        System.out.print(aveVal+" ");
    }
}