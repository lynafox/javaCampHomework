package javaHw2;

public class CourseManager {
	public void register(Courses course) {
		System.out.println(course.getHeader() + "'na Kayıt Olundu.");
	}
	public void remove (Courses course) {
		System.out.println(course.getHeader()+ "dan Kaydınız Silindi.");
	}
	
	public void printAll (Courses course ) {
		System.out.println(course.getImageLink());
		System.out.println(course.getHeader());
		System.out.println(course.getContent());
		System.out.println(course.getPrice());
		
	}
	
}
