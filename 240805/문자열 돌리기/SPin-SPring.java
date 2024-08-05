import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);

        int L = str.length();
        for(int i=0; i<L; i++) {
            str = str.substring(L-1,L)+str.substring(0,L-1);
            System.out.println(str);
        }
    }
}