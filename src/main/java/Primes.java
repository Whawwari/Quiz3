public class Primes {

    // Check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) { // Fixed: Loop runs up to sqrt(number)
            if (number % i == 0) return false;
        }
        return true;
    }

    // Find the smallest prime factor of a number
    public static int smallestPrimeFactor(int number) {
        if (number <= 1) return -1; // No prime factors for 0, 1, or negatives
        for (int i = 2; i <= number; i++) { // Fixed: Loop runs up to the number
            if (number % i == 0) return i;
        }
        return number; // Fixed: Returns the number if it is prime
    }

    // Check primality using the Sieve of Eratosthenes
    public static boolean sieveOfEratosthenes(int number) {
        if (number <= 1) return false; // Numbers less than 2 are not prime
        boolean[] primes = new boolean[number + 1]; // Fixed: Array includes `number`
        for (int i = 2; i <= number; i++) primes[i] = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (primes[i]) {
                for (int j = i * i; j <= number; j += i) { // Fixed: Loop includes `number`
                    primes[j] = false;
                }
            }
        }
        return primes[number]; // Check thDe primality of the input number
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("isPrime(29): " + isPrime(29)); // true
        System.out.println("isPrime(30): " + isPrime(30)); // false

        System.out.println("smallestPrimeFactor(30): " + smallestPrimeFactor(30)); // 2
        System.out.println("smallestPrimeFactor(29): " + smallestPrimeFactor(29)); // 29

        System.out.println("sieveOfEratosthenes(29): " + sieveOfEratosthenes(29)); // true
        System.out.println("sieveOfEratosthenes(30): " + sieveOfEratosthenes(30)); // false
    }
}
