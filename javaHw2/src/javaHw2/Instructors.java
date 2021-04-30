package javaHw2;

public class Instructors {

	public Instructors(int id, String profilePhotoLink, String nameSurname) {
		this.id = id;
		this.profilePhotoLink = profilePhotoLink;
		this.nameSurname = nameSurname;
		
	}
	
	public Instructors () {
		
	}

	private int id;
	private String profilePhotoLink;
	private String nameSurname;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public String setProfilePhotoLink() {
		return profilePhotoLink;
	}
	public void setProfilePhotoLink(String profilePhotoLink) {
		this.profilePhotoLink=profilePhotoLink;
	}
	public String getNameSurname() {
		return nameSurname;
	}
	public void setNameSurname(String nameSurname) {
		this.nameSurname=nameSurname;
	}

}
