import java.util.Scanner;

public class segSieve {

    static void SegSieve(int l, int h) {
        boolean[] prime = new boolean[h + 1];
        
        // Marking non-prime numbers
        for (int p = 2; p * p <= h; p++) {
            int sm = (l / p) * p;
            if (sm < l) {
                sm = sm + p;
            }
            for (int i = sm; i <= h; i += p)
                if (i != p)  // Avoid marking the prime number itself
                    prime[i] = true;
        }

        // Printing prime numbers in the range [l, h]
        for (int i = l; i <= h; i++) {
            if (!prime[i] && i > 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }}