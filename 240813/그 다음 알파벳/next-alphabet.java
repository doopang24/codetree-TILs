import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int chInt = (int)ch;
        
        if(chInt==122) {
            chInt = 97;
        } else {
            chInt++;
        }

        System.out.print((char)chInt);
    }
}