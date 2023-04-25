package inheritance;

public class Circle extends Boundshape {
	private int radius;
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius=radius;
	}
	@Override
	public String toString() {
		return (super.toString()+"radius"+radius);
	}
@Override
public double area() {
	return(3.14*radius*radius);
}
@Override
public double perimeter() {
	return (2*3.14*radius);
}
public void drawarc(double angle) {
	System.out.println("dra circle with angle");
}
}
