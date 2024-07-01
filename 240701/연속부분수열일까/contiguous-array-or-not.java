import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int dif = 0;

        for(int i=0; i<n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<n2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        boolean check = false;
        for(int i=0; i<=n1-n2; i++) {
            boolean match = true;
            for(int j=0; j<n2; j++) {
                if(arr2[j]!=arr1[j+i])
                    match = false;
            }
            if(match) {
                System.out.print("Yes");
                check = true;
            }
        }
        if(!check) System.out.print("No");
    }
}