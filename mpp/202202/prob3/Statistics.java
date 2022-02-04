package prob3;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically
	 * computes and returns the sum
	 * of all the salaries of all the employees/managers in the list.
	 */
	public static double computeSumOfSalaries(List<Payable> aList) {
		if (aList == null || aList.size() == 0) {
			return 0.0;
		}
		//implement
		//compute sum of all salaries of people in aList and return
		double sum = 0;
		for (int i = 0; i < aList.size(); i++) {
			Payable payable = aList.get(i);
			sum += payable.getSalary();
		}
		return sum;
	}
}
