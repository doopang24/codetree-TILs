import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumVal = 0;

        for(int i=1; i<n; i++) {
            if(n%i==0) sumVal += i;
        }

        System.out.print(n==sumVal?"P":"N");
        //if(sumVal==n) System.out.print("P");
        //else System.out.print("N");
    }
}