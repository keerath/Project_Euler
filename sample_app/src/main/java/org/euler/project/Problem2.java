package org.euler.project;

public class Problem2 {
	long sum = 2;

	public long calc() {
		long a = 1;
		long b = 2;
		long c = 0;

		while (c <= 4000000) {
			c = a + b;
			if (c % 2 == 0)
				sum += c;
			a = b;
			b = c;
			System.out.println(c);
		}
		return sum;
	}

}
