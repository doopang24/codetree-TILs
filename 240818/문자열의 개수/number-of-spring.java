import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String[] words = new String[200];

        for(int i=0; i<200; i++) {
            String str = sc.next();
            if(str.equals("0")) break;
            cnt++;
            if(i%2==0) {
                words[i] = str;
            }
        }
        System.out.println(cnt);

        for(int i=0; i<200; i+=2) {
            if(words[i]==null) {
                break;
            } else {
                System.out.println(words[i]);
            }
        }
    }
}