package ss2_loop;

import static ss2_loop.First_20_Prime.isPrime;

public class Primes_100 {
    public static void main(String[] args) {

        int num = 2;
        while (num < 100) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
