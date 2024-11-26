import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class strobogrammatic {
    static boolean strobo(String num){
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('1', '1');
        map.put('0', '0');
        map.put('8', '8');
        
        int l = 0, r = num.length() - 1;
        while(l <= r){
            if(!map.containsKey(num.charAt(l)) || map.get(num.charAt(l)) != num.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        System.out.println(strobo(num));
        sc.close();
    }
}
