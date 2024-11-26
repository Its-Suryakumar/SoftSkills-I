import java.util.*;
public class Longafterflip {
    public static int lco(int n){
        String binary = Integer.toBinaryString(n);
        int maxLength = 0;
        int currentLength = 0;
        int previousLength = 0;
        for(char bit: binary.toCharArray()){
            if(bit == '1'){
                currentLength++;
            }
            else{
                maxLength = Math.max(maxLength, currentLength+previousLength+1);
                previousLength = currentLength;
                currentLength = 0;
            }
        }
        maxLength = Math.max(maxLength, currentLength+previousLength+1);
        return maxLength;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);    
        n = sc.nextInt();
        System.out.println(lco(n));
        sc.close();
    }
}