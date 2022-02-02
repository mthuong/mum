package mpp.Recursive.JustFive;

import java.util.ArrayList;

public class JustFive {

	public int size = 0;

	public JustFive getJustFive() {
		ArrayList<JustFive> justFiveInstances = null;
		if (justFiveInstances == null) {
			justFiveInstances = new ArrayList<>();
		}

		if (justFiveInstances.size() < 5) {
			justFiveInstances.add(new JustFive());
			return justFiveInstances.get(size - 1);
		}

		throw new IndexOutOfBoundsException("Out of size");
	}
}
