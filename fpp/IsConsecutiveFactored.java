package fpp;

import java.util.ArrayList;
import java.util.List;

public class IsConsecutiveFactored {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 24;
		System.out.println(isConsectiveFactored(n));
		
		n = 105;
		System.out.println(isConsectiveFactored(n));
		
		n = 90;
		System.out.println(isConsectiveFactored(n));
		
		n = 23;
		System.out.println(isConsectiveFactored(n));
		
		n = 15;
		System.out.println(isConsectiveFactored(n));
		
		n = 2;
		System.out.println(isConsectiveFactored(n));
		
		n = 0;
		System.out.println(isConsectiveFactored(n));
		
		n = -12;
		System.out.println(isConsectiveFactored(n));
	}
	
	static int isConsectiveFactored(int n) {
		if (n < 0) {
			return 0;
		}
		
		List<Integer> factors = new ArrayList<>();
		
		for(int i = 2; i < n; i++) {
			if (n % i == 0) {
				factors.add(i);
			}
		}
		
		if (factors.size() < 2) {
			return 0;
		}
		
		for(int i = 0; i < factors.size() - 1; i++) {
			int ai = factors.get(i);
			int aj = factors.get(i+1);
			if (ai < aj && aj == ai + 1) {
				return 1;
			}
		}
		
		return 0;
	}

}
