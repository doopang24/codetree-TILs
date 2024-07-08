import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = new int[2][4];
        int sumTotal = 0;
        for(int i=0; i<2;i++) {
            for(int j=0; j<4; j++) {
                arr2D[i][j] = sc.nextInt();
                sumTotal += arr2D[i][j];
            }
        }
        for(int i=0; i<2; i++) {
            int sumI = 0;
            for(int j=0; j<4; j++) {
                sumI += arr2D[i][j];
            }
            System.out.print(sumI/4.0+" ");
        }
        System.out.println();

        int sumJ0=0, sumJ1=0, sumJ2=0, sumJ3=0;
        for(int i=0; i<2; i++) {
            for(int j=0; j<4; j++) {
                if(j==0)      sumJ0 += arr2D[i][j];
                else if(j==1) sumJ1 += arr2D[i][j];
                else if(j==2) sumJ2 += arr2D[i][j];
                else if(j==3) sumJ3 += arr2D[i][j];
            }
        }
        System.out.println(sumJ0/2.0+" "+sumJ1/2.0+" "+sumJ2/2.0+" "+sumJ3/2.0);

        System.out.printf("%.1f",sumTotal/8.0);
    }
}