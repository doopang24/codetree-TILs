import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(90<=a && 95<=b) {
            System.out.println(10);
        } else if(90<=a && 90<=b) {
            System.out.println(5);
        } else {
            System.out.println(0);
        }
    }
}