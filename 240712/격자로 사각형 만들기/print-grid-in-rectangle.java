import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr2D = new int[n][n];

        for(int i=0; i<n; i++) {
            arr2D[i][0] = 1;
            arr2D[0][i] = 1;
        }
        for(int i=1; i<n; i++) {
            for(int j=1; j<n; j++) {
                arr2D[i][j] = arr2D[i-1][j] + arr2D[i][j-1] + arr2D[i-1][j-1];
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