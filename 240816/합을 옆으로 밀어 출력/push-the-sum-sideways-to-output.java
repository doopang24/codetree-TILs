import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        //System.out.println(sum);

        String sumString = Integer.toString(sum);
        int s = sumString.length();
        System.out.print(sumString.substring(1,s) + sumString.substring(0,1));
    }
}