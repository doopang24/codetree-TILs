import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = n;

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        while(idx>0) {
            int maxValue = 0;
            for(int i=0; i<idx; i++) {
                if(maxValue<arr[i]) maxValue = arr[i];
            }

            for(int i=0; i<idx; i++) {
                if(arr[i]==maxValue) {
                    System.out.print(i+1+" ");
                    idx = i;
                    break;
                }
            }
        }
    }
}