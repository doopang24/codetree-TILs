import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        boolean satisfied = true;
        int n;

        for(int i=0; i<5; i++) {
            n = sc.nextInt();
            if(n%3!=0) satisfied = false;
        }
        if(satisfied) System.out.println(1);
        else System.out.println(0);
    }
}