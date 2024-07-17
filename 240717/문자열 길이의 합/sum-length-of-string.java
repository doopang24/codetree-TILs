import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0, sumLength = 0;;
        String[] strArr = new String[n];

        for(int i=0; i<n; i++) {
            strArr[i] = sc.next();
            if(strArr[i].charAt(0)=='a') cnt++;
            sumLength += strArr[i].length();
        }

        System.out.print(sumLength+" "+cnt);
    }
}