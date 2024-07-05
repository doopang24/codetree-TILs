import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int maxValue = 0;
        int minValue = 1000;

        for(int i=0; i<10; i++) {
            int n = sc.nextInt();
            if(n>maxValue && n<500) {
                maxValue = n;
            } else if(n<minValue && n>500) {
                minValue = n;
            }
        }

        System.out.print(maxValue + " " + minValue);
    }
}