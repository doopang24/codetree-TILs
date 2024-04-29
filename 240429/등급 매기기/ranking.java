import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(90<=n) {
            System.out.println('A');
        } else if(80<=n) {
            System.out.println('B');
        } else if(70<=n) {
            System.out.println('C');
        } else if(60<=n) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}