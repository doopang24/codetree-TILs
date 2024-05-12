import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int Aage = sc.nextInt();
        char Asex = sc.next().charAt(0);
        int Bage = sc.nextInt();
        char Bsex = sc.next().charAt(0);

        if(19<=Aage && Asex=='M') {
            System.out.println(1);
        } else if(19<=Bage && Bsex=='M') {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}