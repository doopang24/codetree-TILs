import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        final int INT_MAX = Integer.MAX_VALUE;
        int min = INT_MAX;
        int cnt = 0;

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]<min) min = arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i]==min) cnt++;
        }

        System.out.print(min+" "+cnt);
    }
}