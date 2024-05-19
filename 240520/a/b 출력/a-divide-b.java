import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        double c = a/b;

       // for(int i=0; i<20; i++) {
      //      c /= 10;
       // }

       // for(int i=0; i<20; i++) {
       //     c *= 10;
      //  }

        System.out.printf("%22.20f", c);
    }
}