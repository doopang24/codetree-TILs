import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean same = false;
        for(int i=0; i<n; i++) {
            boolean check = false;
            for(int j=0; j<n; j++) {
                if(arr[i]==arr[j] && i!=j) {
                    check = true;
                    same = true;
                }
            }
            if(!check) arr2[i] = arr[i];
        }
        
        int max = 0;
        for(int i=0; i<n; i++) {
            if(max<arr2[i]) max = arr2[i];
        }

        if(same) System.out.print(max);
        else System.out.print(-1);
    }
}