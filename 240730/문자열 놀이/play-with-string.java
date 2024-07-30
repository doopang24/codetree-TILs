import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int q = sc.nextInt();

        for(int i=0; i<q; i++) {
            int dv = sc.nextInt();
            if(dv==1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                char tmp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = tmp;
                System.out.println(String.valueOf(arr));
            } else {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                for(int j=0; j<str.length(); j++) {
                    if(arr[j]==a) arr[j] = b;
                }
                System.out.println(String.valueOf(arr));
            }
        }
    }
}