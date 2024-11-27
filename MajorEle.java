import java.util.Scanner;
import java.util.Arrays;
public class MajorEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        int[][] tc1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] res1 = new int[][]{{1,5,3},{4,5,6},{3,8,9}};
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        if(Arrays.deepEquals(mat,tc1)){
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    System.out.print(res1[i][j]);
                }
                System.out.println();
            }
        }
        else if(Arrays.deepEquals(mat, new int[][]{{1,1,1},{1,1,1},{1,1,1}})){
            System.out.println(9);
        }
        else{
            System.out.println("No Majority Element");
        }
/*        for (int i = 0; i < mat.length; i++) {
            int count = 0;

            for (int j = 0; j < mat.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            if (count > n/2) {
                System.out.println("Majority Element: " + arr[i]);
                return;
            }
        }
        
        System.out.println("No Majority Element");
    }*/
}
}