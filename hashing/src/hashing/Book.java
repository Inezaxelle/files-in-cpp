package hashing;

public class Book {

	private String author;
	private String title;

	public Book(String title, String author) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.author=author;
	}
	public boolean equals(Object obj) {
		Book book = (Book)obj;
		return book.title.equals(this.title)&&book.author.equals(this.author);
	}
	public int hashcode() {
		return title.hashCode()+author.hashCode();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
