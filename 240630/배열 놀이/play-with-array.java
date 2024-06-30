import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] nArr = new int[n];
        for(int i=0; i<n; i++) nArr[i] = sc.nextInt();

        for(int i=0; i<q; i++) {
            int k = sc.nextInt();
            if(k==1) {
                int a = sc.nextInt();
                System.out.println(nArr[a-1]);
            } else if(k==2) {
                int b = sc.nextInt();
                boolean check = false;
                for(int j=0; j<nArr.length; j++) {
                    if(nArr[j]==b){
                        System.out.println(j+1);
                        check = true;
                        break;
                    } 
                }
                if(!check) System.out.println(0);
            } else if(k==3) {
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int j=s-1; j<e; j++) {
                    System.out.print(nArr[j]+" ");
                }
                System.out.println();
            }
        }
    }
}