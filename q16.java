
/*2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?*/

public class q16 {
	public static void main(String[] args) {
		long n = (int)Math.pow(2, 1000);
		long s = 0;
		System.out.println(n);
		while (n > 0) {
			s += n % 10;
			n /= 10;
		}
		System.out.println(s);
	}
}