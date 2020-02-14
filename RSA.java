import java.util.Random;

class RSA {

	// Finds the greatest common divisor of two integers p and q using the extended
	// Euclid's algorithm.
	long extended_Euclid(int p, int q) { // x, y, r

		return 0;
	}

	// Finds the modular multiplicative inverse of a modulo m based on the algorithm
	long find_inverse(long a, long m) {

		return 0;
	}

	// Generates a random prime number.
	int random_prime() {

		Random r = new Random();
		int num = r.nextInt();

		while (!isPrime(num)) {
			num = r.nextInt();
		}

		return num;

	}

	// Check if a number is prime or not.
	boolean isPrime(int p) {

		if (p == 2)
			return true;
		if (p < 2)
			return false;

		for (int i = 2; i < p; i++)
			if (p % i == 0)
				return false;

		return true;
	}

	// Generate Keys method.
	long[] generate_keys() {

		return null;
	}

	// Find (b^n mod m) when we are dealing with big numbers, Same as algorithm 5 in
	// 4.2 in the book.
	long modular_exponentiation(long b, long n, long m) {

		long x = 1;
		int bin[] = binary(n);
		long power = b % m;

		for (int i = 0; i < bin.length; i++) {
			if (bin[i] == 1) {
				x = (x * power) % m;
			}
			power = (power * power) % m;

		}

		return x;
	}

	// Takes a string and converts each character to int , ex: Input:KBL, Output:
	// 100111.
	long string_to_int(String text) {

		return 0;
	}

	// Convert from int_to_String , ex: Input: 100111, Output: KBL
	String int_to_String(long inttext) {

		return null;
	}

	// Encryption method.
	long[] encrypt(String plaintext, long e, long n) {

		return null;
	}

	String decrypt(long[] ciphertext, long d, long n) {
		return null;
	}

	int[] binary(long num) {

		String str = "";
		long r;

		do {

			r = num % 2;
			num = num / 2;
			str = r + str;

		} while (num != 0);

		int bin[] = new int[str.length()];
		int size = str.length() - 1;

		for (int i = 0; i < str.length(); i++) {
			bin[i] = Integer.parseInt("" + str.charAt(size--));
		}

		return bin;
	}
}// End class
