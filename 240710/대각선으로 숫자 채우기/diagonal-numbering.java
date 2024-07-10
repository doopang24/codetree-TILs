import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i, j, value = 1;
        int[][] arr2D = new int[n][m];

        for(int k=0; k<n+m-1; k++) {
            int startRow = Math.max(0, k-m+1);
            int endRow = Math.min(k,n-1);
            for(i=startRow; i<=endRow; i++) {
                j = k-i;
                arr2D[i][j] = value++;
            }
        }
        
        for(i=0; i<n; i++) {
            for(j=0; j<m; j++) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}