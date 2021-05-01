package javaHw3;

public class UserManager {
	public void addUser () {
		System.out.println("Kullanıcı Kullanıcı Eklendi");
	}
	public void removeUser () {
		System.out.println("Kullanıcı Silindi");
	}
	public void editUser () {
		System.out.println("Kullanıcı Düzenlendi");
	}
	
	public void addUserMultiple (User[] users) {
		for(User user:users) {
			addUser();			
		}
	}
}
