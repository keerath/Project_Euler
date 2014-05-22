package org.euler.project;

public class Problem7 {
	int i = 7;
	int count;
	int pcount;
	int n = 4;
	int fcount;

	public int calc() {
		do {
			i += 2;
			if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				continue;
			} else {

				fcount = 0;
				pcount = 0;
				for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++) {
					count = 0;
					for (int k = 1; k <= j; k++) {
						if (j % k == 0 && count <= 2)
							count++;
					}
					if (count == 2) {
						fcount++;
						if (i % j != 0)
							pcount++;
					}
				}
				if (pcount == fcount && fcount != 0 && pcount != 0)
					n++;

			}
		} while (n != 10001);
		return i;
	}
}