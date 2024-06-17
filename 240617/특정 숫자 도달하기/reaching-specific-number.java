import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        double avr = 0;

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            avr = sum/(i+1.0);
            if(arr[i+1]>=250) break;
        }
        System.out.print(sum+" ");
        System.out.printf("%.1f",avr);
    }
}