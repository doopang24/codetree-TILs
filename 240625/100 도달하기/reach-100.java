import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = sc.nextInt();
        System.out.print(a+" "+b+" ");

        for(int i=0; i<100; i++) {
            int c = a+b;
            System.out.print(c+" ");
            if(c>100) break;
            a = b;
            b = c;
        }
    }
}