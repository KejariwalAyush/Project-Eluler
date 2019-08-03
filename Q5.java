package codex;

public class q5 {
	public static void main(String[] args) {
		int s = 0;
		byte m=0;
		for (int n = 20; n <= 1000000000; n += 20) {
			m = 1;
			for (int i = 20; i >= 1; i--) {
				if (n % i != 0) {
					m = 0;
					break;
				}
			}
			if (m == 1) {
				s = n;
				break;
			}
		}
		System.out.println(s);

	}
}
