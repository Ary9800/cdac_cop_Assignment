package Testerinherit;
import inheritance.*;
public class Testboundshape {

	public static void main(String[] args) {
		//Boundshape s=new Boundshape(10,20); -we cant make object of abstract class
Boundshape [] sha= {new Circle(10,20,10),new Rrectangle(30,40,8,9)};
for(Boundshape s:sha) {
	System.out.println(s);
	System.out.println("Area "+s.area()+" Perimeter "+s.perimeter());
Circle  bd=new Circle(10,20,10) ;
	bd.drawarc(15);
}
	}

}
