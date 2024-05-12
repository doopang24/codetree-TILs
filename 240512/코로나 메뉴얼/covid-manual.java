import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char xsymp = sc.next().charAt(0);
        int xtem = sc.nextInt();
        char ysymp = sc.next().charAt(0);
        int ytem = sc.nextInt();
        char zsymp = sc.next().charAt(0);
        int ztem = sc.nextInt();

        char x, y, z;
        

        if(xsymp=='Y') {
            if(xtem>=37) {
                x = 'A';
            } else {
                x = 'C';
            }
        } else {
            if(xtem>=37) {
                x = 'B';
            } else {
                x = 'D';
            }
        }

        if(ysymp=='Y') {
            if(ytem>=37) {
                y = 'A';
            } else {
                y = 'C';
            }
        } else {
            if(ytem>=37) {
                y = 'B';
            } else {
                y = 'D';
            }
        }

        if(zsymp=='Y') {
            if(ztem>=37) {
                z = 'A';
            } else {
                z = 'C';
            }
        } else {
            if(ztem>=37) {
                z = 'B';
            } else {
                z = 'D';
            }
        }

        if((x =='A' && y =='A') || (y =='A' && z =='A') || (z =='A' && x =='A')) {
            System.out.println('E');
        } else {
            System.out.println('N');
        }
    }
}