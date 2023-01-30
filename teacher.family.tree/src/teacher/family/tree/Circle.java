/**
 * 
 */
package teacher.family.tree;

/**
 * @author Aphrodice Rwagaju
 *
 */
@entity;
public class Circle extends Shape {
	
	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public void sayYourType() {
		System.out.println("I am sub class Circle");
	}
}