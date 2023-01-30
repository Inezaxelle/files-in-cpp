package revision;

public class MyShape {
	private int color;
	protected int area;
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public int getArea() {
		return area;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
	public void sayYourType() {
		System.out.println("This is a shape");
	}
}