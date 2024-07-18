import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[10];
        boolean check = false;

        for(int i=0; i<10; i++) {
            strArr[i] = sc.next();
        }
        char ch = sc.next().charAt(0);

        for(int i=0; i<10; i++) {
            if(strArr[i].charAt(strArr[i].length()-1)==ch) {
                System.out.println(strArr[i]);
                check = true;
            }
        }
        if(!check) System.out.println("None");
    }
}