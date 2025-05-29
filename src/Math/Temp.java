package Math;

public class Temp {

    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        System.out.println(numPrimeArrangements(5));    
        System.out.println(numPrimeArrangements(100));  
    }

    public static int numPrimeArrangements(int n) {
        int primeCount = 0;
        int MOD = 1_000_000_007;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) primeCount++;
        }
        int nonPrimeCount = n - primeCount;

        long primeFact = factorial(primeCount);
        long nonPrimeFact = factorial(nonPrimeCount);

        return (int) ((primeFact * nonPrimeFact) % MOD);
    }

    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Compute factorial modulo MOD
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % MOD;
        }
        return result;
    }
}
