import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 1;
        int[][] arr2D = new int[n][n];

        for(int j=n-1; j>=0; j--) {
            if(j%2!=0) {
                for(int i=n-1; i>=0; i--) {
                    arr2D[i][j] = value++;
                }
            } else {
                for(int i=0; i<n; i++) {
                    arr2D[i][j] = value++;
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}