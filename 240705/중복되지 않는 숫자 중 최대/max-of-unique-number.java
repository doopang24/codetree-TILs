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

        int[] arr2 = new int[n];
        for(int i=0; i<n; i++) {
            boolean check = true;
            for(int j=0; j<n; j++) {
                if(arr[i]==arr[j] && i!=j) check = false;
            }
            if(check) arr2[i] = arr[i];
        }

        int maxValue = 0;
        for(int i=0; i<n; i++) {
            if(maxValue<arr2[i]) maxValue = arr2[i];
        }
        if(maxValue==0){
            System.out.print(-1);
        } else {
            System.out.print(maxValue);
        }
        
    }
}