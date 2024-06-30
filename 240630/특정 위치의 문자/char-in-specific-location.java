import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        char[] lebros = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        int idx = -1;

        for(int i=0; i<lebros.length; i++) {
            if(lebros[i]==c) idx = i;
        }

        if(idx==-1) System.out.print("None");
        else System.out.print(idx);

    }
}