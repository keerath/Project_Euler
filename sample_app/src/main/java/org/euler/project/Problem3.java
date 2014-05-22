package org.euler.project;

public class Problem3 {
	double n = 600851475143.0;
	int count;
	int max = 0;

	public int calc() {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0.0) {
				count = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0)
						count++;
				}
				if (count == 2)
					if (i > max)
						max = i;
				n = n / i;
			}
		}
		return max;

	}
}
