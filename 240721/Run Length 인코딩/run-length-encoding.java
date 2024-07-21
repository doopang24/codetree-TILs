import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String encodedStr = encode(str);

        System.out.println(encodedStr.length());
        System.out.println(encodedStr);
    }

    public static String encode(String str) {
        if(str==null || str.length()==0) {
            return "";
        }

        StringBuilder encodedString = new StringBuilder();
        int cnt = 1;

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i)==str.charAt(i-1)) {
                cnt++;
            } else {
                encodedString.append(str.charAt(i-1));
                encodedString.append(cnt);
                cnt = 1;
            }
        }

        encodedString.append(str.charAt(str.length()-1));
        encodedString.append(cnt);

        return encodedString.toString();
    }
}