package javaHw3;

public class Instructor extends User {
	private double salary;
	
	public Instructor(int id, String name, String surname, String courses,double salary) {
		super(id,name,surname,courses);
		this.salary = salary;
	}

	public Instructor() {

	}

	public double getSalary () {
		return salary;
	}
	public void setSalary (double salary) {
		this.salary=salary;
	}
}
