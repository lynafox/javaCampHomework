package javaHw3;

public class Student extends User{
	public Student (int studentNumber) {
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
