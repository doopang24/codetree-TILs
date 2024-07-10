import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = 0;
        int[][] arr2D = new int[n][m];

        for(int j=0; j<m; j++) {
            if(j%2==0) {
                for(int i=0; i<n; i++) {
                    arr2D[i][j] = a;
                    a++;
                }
            } else {
                for(int i=n-1; i>=0; i--) {
                    arr2D[i][j] = a;
                    a++;
                }
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}