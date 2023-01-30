package revision;

public class MyMain{
	public static void main(String[] args) {
		MySquare square = new MySquare();
		square.sayYourType();
		square.setSide(2);
		square.setArea();
		System.out.print("The area of the square is: ");
		System.out.println(square.area);

		
		MyRectangle rect = new MyRectangle();
		rect.sayYourType();
		rect.setLength(4);
		rect.setWidth(2);
		rect.setArea();
		System.out.print("The area of the reactangle is: ");
		System.out.println(rect.area);
	}
}