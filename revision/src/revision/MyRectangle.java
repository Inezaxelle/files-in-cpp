package revision;

public class MyRectangle extends MyShape{
	private int width;
	private int length;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public void sayYourType() {
		System.out.println("I am a sub class rectangle");
	}
	public int getArea() {
		return getArea();
	}
	
	public void setArea() {
		this.area = width * length;
	}
}