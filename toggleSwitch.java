import java.util.Scanner;
public class toggleSwitch {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       boolean door[] = new boolean[n+1];
       int i,j, closed = 0, opened = 0;

       for(i=1;i<=n;i++){
            for(j=i;j*i<=n;j++){
                System.out.println(j);
            }
       }
       sc.close(); 
    }
}
