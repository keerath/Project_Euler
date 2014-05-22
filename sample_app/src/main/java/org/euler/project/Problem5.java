package org.euler.project;

public class Problem5 {
	public long calc() {
		long lcm = 1;
		int count;
		for (long i = 1; i <= 20; i++) {
			count = 0;
			for (long k = 1; k <= (lcm * i); k++) {
				if (i <= k)
					if (k % i == 0 && k % lcm == 0 && count == 0) {
						lcm = k;
						count = 1;
					} else if (count == 1)
						break;
			}
		}
		return lcm;
	}
}
