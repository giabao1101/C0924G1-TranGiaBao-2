package ss2_loop;

public class First_20_Prime {

    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        System.out.println("20 số nguyên tố đầu tiên là:");

        while (count < 20) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}