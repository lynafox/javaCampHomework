package javaHw3;

public class Student extends User{
	
	public Student (int id, String name, String surname, String courses,int studentNumber) {
		super(id,name,surname,courses);
		this.studentNumber= studentNumber;
	}
	public Student () {
		
	}
	private int studentNumber;
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber=studentNumber;
	}
}
