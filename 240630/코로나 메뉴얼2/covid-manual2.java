import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        // int cntA, cntB, cntC, cntD;
        // cntA = 0;
        // cntB = 0;
        // cntC = 0;
        // cntD = 0;

        for(int i=0; i<3; i++) {
            char c = sc.next().charAt(0);
            int tem = sc.nextInt();

            if(c=='Y') {
                if(tem>=37) arr[0]++;
                else arr[2]++;
            } else {
                if(tem>=37) arr[1]++;
                else arr[3]++;
            }
        }

        for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
        if(arr[0]>=2) System.out.print("E");
    }
}