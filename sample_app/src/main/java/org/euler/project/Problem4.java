package org.euler.project;

public class Problem4 {
	long num;
	long max = 0;

	public long calc() {
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				num = i * j;
				if (checkPalindrome(num))
					if (num > max)
						max = num;
			}
		}
		return max;
	}

	public boolean checkPalindrome(long n) {
		long a;
		long sum = 0;
		long ncopy = n;
		while (ncopy > 0) {
			a = ncopy % 10;
			sum = sum * 10 + a;
			ncopy = ncopy / 10;
		}
		if (sum == n)
			return true;
		else
			return false;
	}
}
