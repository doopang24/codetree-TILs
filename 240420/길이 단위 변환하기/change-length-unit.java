public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        double ft = 30.48;
        int mi = 160934;
        double a = (double)Math.round(ft*9.2*10)/10;
        double b = (double)Math.round(mi*1.3*10)/10;
        System.out.printf("9.2ft = %.1fcm%n", a);
        System.out.printf("1.3mi = %.1fcm%n", b);
    }
}