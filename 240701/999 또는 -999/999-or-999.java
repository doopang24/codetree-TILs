import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int max = -1000, min = 1000;

        for(int i=0; i<100; i++) {
            int n = sc.nextInt();
            if(n==999 || n==-999) break;
            arr[i] = n;
            if(arr[i]<min) min = arr[i];
            else if(arr[i]>max) max = arr[i];
        }
        System.out.print(max+" "+min);
    }
}