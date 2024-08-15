import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for(int i=0; i<str.length(); i++) {
            if('a'<=str.charAt(i) && str.charAt(i)<='z') {
                result += (char)(str.charAt(i)-'a'+'A');
            } else {
                result += (char)(str.charAt(i)-'A'+'a');
            }
        }
        System.out.print(result);
    }
}