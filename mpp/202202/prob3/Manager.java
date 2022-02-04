package prob3;

public final class Manager implements Payable {
	private double bonus;
	private String name;
	private double salary;
	public Manager(String name, double salary, double bonus) {
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public double getSalary() {
		return salary + bonus;
	}
	public double getBonus() {
		return bonus;
	}
	public String getName() {
		return name;
	}
}
