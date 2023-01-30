package revision;

public class MySquare extends MyShape {
	private int side;
	
	public void sayYourType() {
		System.out.println("I am sub class Square");
	}
	public int getSide() {
		return side;
	}
	
	public void setSide(int side) {
		this.side = side;
	}
	
	public int getArea() {
		return getArea();
	}
	
	public void setArea() {
		area = side * side;
	}
}