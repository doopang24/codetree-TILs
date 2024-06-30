import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] cntArr = new int[7];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++) {
            cntArr[arr[i]]++;
        }
        for(int i=1; i<=6; i++) {
            System.out.println(i + " - " + cntArr[i]);
        }
    }
}