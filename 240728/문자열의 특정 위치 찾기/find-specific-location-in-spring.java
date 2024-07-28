import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        boolean check = false;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==ch) {
                check = true;
                System.out.print(i);
                break;
            }
        }

        if(!check) System.out.print("No");
    }
}