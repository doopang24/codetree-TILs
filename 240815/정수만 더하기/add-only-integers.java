import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = 0;

        for(int i=0; i<str.length(); i++) {
            if('0'<=str.charAt(i) && str.charAt(i)<='9') {
                int num = str.charAt(i) - '0';
                result += num;
            }
        }
        System.out.print(result);
    }
}