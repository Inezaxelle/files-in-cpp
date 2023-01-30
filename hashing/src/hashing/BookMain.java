package hashing;

import java.util.HashSet;

public class BookMain {

	public BookMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("Hamlet", "Shakespeare");
		Book b2=new Book("The Hobbit", "J.R. Tolkien");
		Book b3=new Book("Hamlet", "Shakespeare");
		
		
		System.out.println("B1 equals B2: " + b1.equals(b2));
		System.out.println("B1 equals B3: " + b1.equals(b3));
		
		HashSet<Book> set = new HashSet<>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
		System.out.println("Set size: " + set.size());	

	}

}