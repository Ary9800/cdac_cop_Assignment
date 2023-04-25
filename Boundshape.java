package inheritance;

public abstract class Boundshape {
	private int x;
	private int y;
	public Boundshape(int x, int y) {
		super();
		this.x=x;
		this.y=y;
	}
	@Override
	
public String toString() {
		return ("x"+x+" "+"y"+y);
	}
	public abstract double area();

public abstract double perimeter();
}