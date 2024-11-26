import java.util.Scanner;

public class karatsuba {
    public static long karatsuba(long x,long y){
        if(x<10 || y<10){
            return x*y;
        }

        int n = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half = (n+1)/2;

        long a = x / (long) Math.pow(10, half);
        long b = x % (long) Math.pow(10, half);
        long c = y / (long) Math.pow(10,half);
        long d = y % (long) Math.pow(10,half);

        long ac = karatsuba(a, c);
        long bd = karatsuba(b, d);
        long adbc = karatsuba(a+b, c+d) - ac -bd;
        
        return (long) (ac * Math.pow(10,2*half) + adbc * Math.pow(10, half) + bd); 
    }
    public static void main(String[] args) {
        long a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        long product = karatsuba(a,b);
        System.out.println(product);
        sc.close();
    }
}
