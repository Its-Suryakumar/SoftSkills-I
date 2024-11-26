import java.util.*;
public class MES {
    public static int sum(int[] arr){
        int totalSum = 0;
        int leftSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            totalSum += arr[i];
        }
        for(int i=0;i<arr.length;i++){
            totalSum -=arr[i];
            if(leftSum == totalSum && leftSum > maxSum){
                maxSum = leftSum;
            }
            leftSum += arr[i];
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = sum(arr);
        System.out.println(maxSum);
        sc.close();
    }
}
