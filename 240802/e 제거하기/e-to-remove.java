import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int pos = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='e') {
                pos = i;
                break;
            }
        }

        if(pos==0) {
            System.out.println(str.substring(1,str.length()));
        } else if(pos==str.length()-1) {
            System.out.println(str.substring(0,str.length()-1));
        } else {
            System.out.println(str.substring(0,pos)+str.substring(pos+1,str.length()));
        }
    }
}