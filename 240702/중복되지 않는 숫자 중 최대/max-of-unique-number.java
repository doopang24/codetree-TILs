import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean check = false;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(arr[i]==arr[j] && i!=j) {
                    arr[j] = 0;
                    check = true;
                }
            }
        }
        int max = 0;
        for(int i=0; i<n; i++) {
            if(max<arr[i]) max = arr[i];
        }
        if(check) System.out.print(max);
        else System.out.print(-1);
    }
}