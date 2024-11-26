import java.util.Scanner;
public class rotateArr {
    public static void rotateArray(int[] arr,int d,int n){
        for(int i=0;i<d;i++){
            int first = arr[0];
            for(int j=0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 2;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        rotateArray(arr,d,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
