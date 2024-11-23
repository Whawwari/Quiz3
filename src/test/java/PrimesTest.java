import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimesTest {

    @Test
    void testIsPrime() {
        assertFalse(Primes.isPrime(-1), "-1 is not prime");
        assertFalse(Primes.isPrime(0), "0 is not prime");
        assertFalse(Primes.isPrime(1), "1 is not prime");
        assertTrue(Primes.isPrime(2), "2 is prime");
        assertTrue(Primes.isPrime(3), "3 is prime");
        assertFalse(Primes.isPrime(4), "4 is not prime");
        assertTrue(Primes.isPrime(29), "29 is prime");
        assertFalse(Primes.isPrime(30), "30 is not prime");
    }

    @Test
    void testSmallestPrimeFactor() {
        assertEquals(-1, Primes.smallestPrimeFactor(-1), "No prime factors for negative numbers");
        assertEquals(-1, Primes.smallestPrimeFactor(0), "No prime factors for 0");
        assertEquals(-1, Primes.smallestPrimeFactor(1), "No prime factors for 1");
        assertEquals(2, Primes.smallestPrimeFactor(2), "Smallest prime factor of 2 is 2");
        assertEquals(3, Primes.smallestPrimeFactor(9), "Smallest prime factor of 9 is 3");
        assertEquals(2, Primes.smallestPrimeFactor(20), "Smallest prime factor of 20 is 2");
        assertEquals(11, Primes.smallestPrimeFactor(11), "Smallest prime factor of 11 is 11 (prime number)");
    }

    @Test
    void testSieveOfEratosthenes() {
        assertFalse(Primes.sieveOfEratosthenes(0), "0 is not prime");
        assertFalse(Primes.sieveOfEratosthenes(1), "1 is not prime");
        assertTrue(Primes.sieveOfEratosthenes(2), "2 is prime");
        assertTrue(Primes.sieveOfEratosthenes(3), "3 is prime");
        assertFalse(Primes.sieveOfEratosthenes(4), "4 is not prime");
        assertTrue(Primes.sieveOfEratosthenes(5), "5 is prime");
        assertTrue(Primes.sieveOfEratosthenes(29), "29 is prime");
        assertFalse(Primes.sieveOfEratosthenes(30), "30 is not prime");
    }
}
