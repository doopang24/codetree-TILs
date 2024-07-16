import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int cnt = 0;
        String[] strArr = new String[]{"apple","banana","grape","blueberry","orange"};

        for(int i=0; i<5; i++) {
            if(strArr[i].charAt(2)==ch || strArr[i].charAt(3)==ch){
                System.out.println(strArr[i]);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}