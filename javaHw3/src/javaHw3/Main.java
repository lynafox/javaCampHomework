package javaHw3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Anıl");
		student1.setSurname("Ağhan");
		student1.setCourses("Java");
		student1.setStudentNumber(123456);
		
		//Student student2 = new Student(2,"Gülcan","Ağhan","C#",13245);
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(3);
		instructor1.setName("Engin");
		instructor1.setSurname("Demiroğ");
		instructor1.setCourses("C#,Java");
		instructor1.setSalary(10000);
		
		//Instructor instructor2 = new Instructor(4,"Gizem","Ağhan","Programlamaya Giriş",7000);
		
		
		UserManager userManager = new UserManager();
		userManager.addUser();
		userManager.editUser();
		userManager.removeUser();
		
		System.out.println("---------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.register();
		studentManager.remove();
		
		System.out.println("---------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add();
		instructorManager.remove();
		
		System.out.println("---------------------------");
		
		
	
	}
	

}
