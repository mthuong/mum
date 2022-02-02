package mpp.Recursive.ComputeAverage;

import java.util.HashMap;

public class ComputeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> scores = new HashMap<String, String>();
		scores.put("John William", "77.5");
		scores.put("Annette Jones", "91.0");
		scores.put("Kevin Specker", "88.8");
		ComputeAverage instance = new ComputeAverage();
		double averageScore = instance.computeAverage(scores);
		System.out.println("Average score: " + averageScore);
		
		scores = new HashMap<String, String>();
		averageScore = instance.computeAverage(scores);
		System.out.println("Average score: " + averageScore);
		
		scores = null;
		averageScore = instance.computeAverage(scores);
		System.out.println("Average score: " + averageScore);
	}

	public double computeAverage(HashMap<String, String> scores) {
		if (scores == null || scores.isEmpty())
			return 0;
		int size = scores.size();
		return computeSum(scores) / size;
	}

	public double computeSum(HashMap<String, String> scores) {
		if (scores == null || scores.isEmpty())
			return 0;
		
		String key = scores.keySet().iterator().next(); // get the topmost key
		double score = Double.parseDouble(scores.get(key));
		HashMap<String, String> subMap = new HashMap<String, String>(scores);
		subMap.remove(key);
		return score + computeSum(subMap);
	}
}
