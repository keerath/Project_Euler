package org.euler.project;

import java.util.*;

public class Problem10 {

	long sum = 2;
	int temp;
	ArrayList<Integer> myList = new ArrayList<Integer>(2000000);

	public long calc() {
		for (int i = 3; i < 2000000; i += 2) {
			myList.add(i);
		}
		for (int i = 0; i < myList.size(); i++) {
			temp = myList.get(i);
			for (int j = i + 1; j < myList.size(); j++) {
				if (myList.get(j) % temp == 0)
					myList.remove(j);
			}
		}
		for (int i = 0; i < myList.size(); i++)
			sum += myList.get(i);
		return sum;
	}
}