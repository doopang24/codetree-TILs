import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i=0; i<8; i++) {
            int c = a+b;
            a = b;
            b = c;
            if(c>=10) System.out.print(c%10 + " ");
            else System.out.print(c+" ");
        }
    }
}