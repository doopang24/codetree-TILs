import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ab = a + b;

        String AB = Integer.toString(ab);

        int cnt = 0;
        for(int i=0; i<AB.length(); i++) {
            if(AB.charAt(i)=='1') {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}