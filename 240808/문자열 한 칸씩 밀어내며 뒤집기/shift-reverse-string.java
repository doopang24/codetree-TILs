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
                str = rotateLeft(str,1);
                System.out.println(str);
            } else if(num==2) {
                str = rotateRight(str, 1);
                System.out.println(str);
            } else {
                str = reverse(str);
                System.out.println(str);
            }
        }
    }

    public static String rotateLeft(String str, int d) {
        return str.substring(d) + str.substring(0,d);
    }

    public static String rotateRight(String str, int d) {
        return str.substring(str.length()-d) + str.substring(0,str.length()-d);
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}