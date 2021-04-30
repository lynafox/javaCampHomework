package javaHw2;

public class Main {

	public static void main(String[] args) {

		Courses courseC = new Courses();
		courseC.setId(1);
		courseC.setImageLink("www.kursfotografi.com");
		courseC.setHeader("Yazılım Geliştirici Yetiştirme Kampı C# + ANGULAR");
		courseC.setContent("2 ay sürecek Yaılım Geliştirici Yetiştirme Kampımızı takip...");
		courseC.setPrice("ÜCRETSİZ");
		CourseManager courseManager = new CourseManager();
		courseManager.register(courseC);
		courseManager.remove(courseC);

		System.out.println("--------------------------");

		Instructors instructor1 = new Instructors();
		instructor1.setId(1);
		instructor1.setProfilePhotoLink("wwww.profilfoto1.com");
		instructor1.setNameSurname("Engin Demiroğ");

		Courses courseJava = new Courses(1, "www.kursfotografi.com",
				"Yazılım Geliştirici Yetiştirme Kampı Java + React",
				"2 ay sürecek Yaılım Geliştirici Yetiştirme Kampımızı takip...", "Ücretsiz");
		Instructors instructor2 = new Instructors(2, "www.profilfoto2.com", "Engin Demiroğ");
		courseManager.register(courseJava);
		courseManager.remove(courseJava);

		System.out.println("--------------------------");

		Courses coursePrograming = new Courses(1, "www.kursfotografi.com", "Programlamaya Giriş İçin Temel Kurs",
				"Python, Java gibi...", "Ücretsiz");
		Instructors instructor3 = new Instructors(2, "www.profilfoto3.com", "Engin Demiroğ");
		courseManager.register(coursePrograming);
		courseManager.remove(coursePrograming);

		System.out.println("--------------------------");

		Courses[] courses = { courseC, courseJava, coursePrograming };
		Instructors[] instructors = { instructor1, instructor2, instructor3 };

		for (Courses course : courses) {
			courseManager.printAll(course);
}
		}

	}


