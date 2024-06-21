import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0; 
        int sum3 = 0;
        double avr, cnt=0.0;

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
            if(i%2!=0) sum += arr[i];
            if((i+1)%3==0) {
                sum3 += arr[i];
                cnt++;
            }
        }
        avr = sum3/cnt;

        System.out.print(sum+" ");
        System.out.printf("%.1f", avr);
    }
}