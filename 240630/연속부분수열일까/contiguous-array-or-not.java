import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        int dif = 0;

        for(int i=0; i<n1; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i=0; i<n2; i++) {
            arr2[i] = sc.nextInt();
        }

        for(int i=0; i<n1; i++) {
            if(arr1[i]==arr2[0]) {
                dif = i;
                break;
            }
        }
        boolean match = true;
        for(int i=0; i<n2; i++) {
            if(arr2[i]!=arr1[i+dif]) {
                match = false;
                break;
            }
        }
        if(match) System.out.print("Yes");
        else System.out.print("No");
    }
}