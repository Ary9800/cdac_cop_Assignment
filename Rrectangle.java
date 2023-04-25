package inheritance;

public class Rrectangle extends Boundshape {
	private int length;
	private int breath;
	public Rrectangle(int x, int y, int length,int breath) {
		super(x,y);
		this.length=length;
		this.breath=breath;
	}
	@Override
	public String toString() {
		return (super.toString()+"length"+length+"breath"+breath);
	}
@Override
public double area() {
	return(length*breath);
}
@Override
public double perimeter() {
	return (2*(length*breath));
}

}
