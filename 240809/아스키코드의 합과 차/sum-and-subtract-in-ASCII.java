import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char left = sc.next().charAt(0);
        char right = sc.next().charAt(0);

        System.out.print((int)left+(int)right+" ");

        if((int)left>(int)right) {
            System.out.print((int)left-(int)right);
        } else {
            System.out.print((int)right-(int)left);
        }
    }
}