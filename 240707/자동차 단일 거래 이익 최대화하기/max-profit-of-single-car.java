import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int maxValue = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i<j && (arr[j]-arr[i]>maxValue)) {
                    maxValue = arr[j]-arr[i];
                }
            }
        }

        System.out.print(maxValue);
    }
}