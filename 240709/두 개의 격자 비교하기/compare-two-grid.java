import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr2D1 = new int[n][m];
        int[][] arr2D2 = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr2D1[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr2D2[i][j] = sc.nextInt();
                if(arr2D1[i][j]==arr2D2[i][j]) {
                    arr2D2[i][j] = 0;
                } else {
                    arr2D2[i][j] = 1;
                }
                System.out.print(arr2D2[i][j]+" ");
            }
            System.out.println();
        }

    }
}