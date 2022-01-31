package mpp.Polymorphism.DataMiner;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataMiner dataMiner = new DataMiner();
		List<Shape> populatedList = dataMiner.populateList();
		double averageArea = dataMiner.computeAverageArea(populatedList);
		System.out.println("Average area: " + averageArea);
	}
	
	interface Shape {
		double computeArea();
	}
	
	class Circle implements Shape {
		double radius;
		
		public Circle(double r) {
			this.radius = r;
		}

		@Override
		public double computeArea() {
			// TODO Auto-generated method stub
			return Math.PI * radius * radius;
		}
	}
	
	class Rectangle implements Shape {
		double width;
		double height;
		
		public Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}

		@Override
		public double computeArea() {
			// TODO Auto-generated method stub
			return width * height;
		}
	}
	
	public List<Shape> populateList() {
		List<Shape> populateList = new ArrayList<>();
		Circle circle1 = new Circle(2);
		Rectangle rectangle1 = new Rectangle(2, 3);
		Rectangle rectangle2 = new Rectangle(5, 6);
		Circle circle2 = new Circle(4);
		populateList.add(circle1);
		populateList.add(rectangle1);
		populateList.add(rectangle2);
		populateList.add(circle2);
		
		return populateList;
	}
	
	public double computeAverageArea(List<Shape> objects) {
		if (objects == null || objects.size() == 0) {
			return 0;
		}
		
		double averageArea = 0;
		double sumArea = 0;
		for (int i = 0; i < objects.size(); i++) {
			Shape shape = objects.get(i);
			sumArea += shape.computeArea();
		}
		
		averageArea = sumArea / objects.size();
		
		return averageArea;
	}
	

}

