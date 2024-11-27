import java.util.*;
public class Combination {
    static int factorial(int number){
        int fact = 1;
        int i = 1;
        while(i<=number){
            fact = fact * i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(12);
        numbers.add(19);
        numbers.add(61);
        numbers.add(19);
        int n = numbers.size();
        int r=2;
        int result = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println("The combination value for the numbers list is: " + result);
    }
}
