import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();

        for(int i=0; i<q; i++) {
            int num = sc.nextInt();
            if(num==1) {
                str = str.substring(1,str.length()) + str.substring(0,1);
                System.out.println(str);
            } else if(num==2) {
                str = str.substring(str.length()-1,str.length()) + str.substring(0,str.length()-1);
                System.out.println(str);
            } else {
                String tmp = "";
                for(int j=str.length()-1; j>=0; j--) {
                    tmp += str.charAt(j);
                }
                str = tmp;
                System.out.println(str);
            }
        }
    }
}