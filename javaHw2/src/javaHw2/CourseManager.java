package javaHw2;

public class CourseManager {
	public void register(Courses course) {
		System.out.println(course.getHeader() + "'na Kayıt Olundu.");
	}
	public void remove (Courses course) {
		System.out.println(course.getHeader()+ "dan Kaydınız Silindi.");
	}
	
}
