package javaHw2;

public class Courses {
	public Courses(int id, String imageLink, String header, String content, String price) {
		this.id = id;
		this.imageLink = imageLink;
		this.header = header;
		this.content = content;
		this.price = price;
		
	}

	public Courses() {
		
	}

	private int id;
	private String imageLink;
	private String header;
	private String content;
	private String price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
