import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        char fir = arr[0], sec = arr[1];

        for(int i=0; i<str.length(); i++) {
            if(arr[i]==sec) arr[i]=fir;
        }
        System.out.print(String.valueOf(arr));
    }
}