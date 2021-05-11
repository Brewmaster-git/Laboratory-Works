public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++)
            if (isPrime(i) == true)
                System.out.println(i);
    }

    //Проверка на простое число.
    public static boolean isPrime (int n) {
        boolean prime = true;
        for (int i = 2; i < 100 && i != n; i++)
            if (n % i == 0)
                prime = false;
        return prime;
    }
}