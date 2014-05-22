package org.euler.project;

public class Problem1 {
	int sum = 0;

	public int calc() {
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		return sum;
	}
}
