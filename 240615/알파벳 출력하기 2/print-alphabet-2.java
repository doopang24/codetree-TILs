import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char cnt = 'A';

        for(int i=0; i<n; i++) {
            for(int k=0; k<i; k++) {
                System.out.print("  ");
            }
            for(int j=0; j<n-i; j++) {
                System.out.print(cnt+" ");
                cnt++;
                if(cnt>'Z') cnt='A';
            }
            System.out.println();
        }
    }
}