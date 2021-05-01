package javaHw3;

public class Instructor extends User {
	public Instructor(double salary) {
		this.salary = salary;
	}

	public Instructor() {

	}

	private double salary;
	public double getSalary () {
		return salary;
	}
	public void setSalary (double salary) {
		this.salary=salary;
	}
}
