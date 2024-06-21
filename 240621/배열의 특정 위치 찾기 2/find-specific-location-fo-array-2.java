import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sumEven = 0, sumOdd = 0;

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
            if(i%2==0) sumOdd += arr[i];
            else sumEven += arr[i];
        }
        if(sumEven>=sumOdd) System.out.print(sumEven-sumOdd);
        else System.out.print(sumOdd-sumEven);
    }
}