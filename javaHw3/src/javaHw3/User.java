package javaHw3;

public class User {
	public User(int id, String name, String surname, String courses) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.courses = courses;

	}

	public User() {

	}

	private int id;
	private String name;
	private String surname;
	private String courses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

}
