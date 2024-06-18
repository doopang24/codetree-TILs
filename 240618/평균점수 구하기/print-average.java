import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double sum=0, avr;

        for(int i=0; i<8; i++) {
            double n = sc.nextDouble();
            sum += n;
        }
        avr = sum/8;
        System.out.printf("%.1f",avr);
    }
}