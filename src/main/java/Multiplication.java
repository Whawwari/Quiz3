public class Multiplication {

    // Direct multiplication using the * operator
    public static int multiply(int a, int b) {
        // Corrected: Proper handling of zero cases
        if (a == 0 || b == 0) return 0;
        return a * b;
    }

    // Multiplication using repeated addition
    public static int multiplyUsingLoop(int a, int b) {
        int result = 0;
        int absB = Math.abs(b); // Take the absolute value of b
        for (int i = 0; i < absB; i++) { // Corrected: Loop runs exactly absB times
            result += a;
        }
        // Adjust the sign of the result if b is negative
        return (b < 0) ? -result : result;
    }

    // Multiplication using bitwise operations
    public static int multiplyUsingShift(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int result = 0;

        // Perform multiplication using bitwise shift
        while (absB > 0) {
            if ((absB & 1) == 1) result += absA;
            absB >>= 1; // Divide absB by 2
            absA <<= 1; // Multiply absA by 2
        }

        // Corrected: Adjust the sign based on the signs of a and b
        return (a < 0 ^ b < 0) ? -result : result; // XOR to check if signs differ
    }

    public static void main(String[] args) {
        int a = -3, b = 4;
        System.out.println("Multiply: " + multiply(a, b)); // Should print -12
        System.out.println("Loop Multiply: " + multiplyUsingLoop(a, b)); // Should print -12
        System.out.println("Shift Multiply: " + multiplyUsingShift(a, b)); // Should print -12
    }
}
