import java.util.Scanner;
public class simpleSieve{
    public static void sieve(int num){
        boolean[] prime = new boolean[num+1]; //create array

        for(int i=2;i<=num;i++){
            prime[i] = true; //inititalise true for all elements of an array
        }

        for(int p=2;p<=num;p++){    //iterate through every element
            if(prime[p]==true){     //check if it is not traversed it (still true)
                for(int i=p*p;i<=num;i+=p){ //assign its multiples as false
                    prime[i] = false;
                }
            }
        }

        for(int i=2;i<=num;i++){
            if(prime[i]==true){     //iterate and print all the true elements
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sieve(num);
        sc.close();
    }
}