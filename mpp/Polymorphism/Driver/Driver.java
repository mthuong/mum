package mpp.Polymorphism.Driver;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	List<Maker> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		driver.list.add(new HatMaker());
		driver.list.add(new HatMaker());
		driver.list.add(new VeeMaker());
		driver.list.add(new ParallelMaker());
		System.out.println(driver.make());
	}

	public String make() {
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			Maker maker = list.get(i);
			result += maker.getFigure() + " ";
		}
		return result;
	}

}

interface Maker {
	String getFigure();
}

class HatMaker implements Maker {

	@Override
	public String getFigure() {
		// TODO Auto-generated method stub
		return "/\\";
	}

}

class ParallelMaker implements Maker {

	@Override
	public String getFigure() {
		// TODO Auto-generated method stub
		return "||";
	}

}

class VeeMaker implements Maker {

	@Override
	public String getFigure() {
		// TODO Auto-generated method stub
		return "\\/";
	}

}