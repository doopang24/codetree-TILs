import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr2D = new int[n][n];

        for(int i=0; i<n; i++) {
            int a = i+1;
            for(int j=0; j<n; j++) {
                arr2D[i][j] = a;
                a += n;
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}