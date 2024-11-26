import java.util.*;
public class binaryPalindrome{
    public static boolean isbinaryPalindrome(int x){
        int reversed = 0;
        int original = x;
        while(x>0){
            reversed <<=1;
            reversed |= (x&1);
            x >>=1;
        }
        return reversed==original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(isbinaryPalindrome(x)){
            System.out.println(true);
        }
        else{
            System.err.println(false);
        }
        sc.close();
    }
}