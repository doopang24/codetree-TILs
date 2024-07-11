public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int[][] arr2D = new int[5][5];

        for(int i=0; i<5; i++) {
            arr2D[0][i] = 1;
            arr2D[i][0] = 1;
        }
        for(int i=1; i<5; i++) {
            for(int j=1; j<5; j++) {
                arr2D[i][j] = arr2D[i][j-1]+arr2D[i-1][j];
            }
        }
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}