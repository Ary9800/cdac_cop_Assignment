package Testercar;
import Carabstract.*;
public class Testcars {

	public static    void startRace(Cars c)
	{
		c.speed();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cars c;
		//c=new Car();//error
		
		Bmw bmw=new Bmw();
		bmw.speed();
		System.out.println(bmw.getCarDetails());
		 
		 startRace(bmw);//startRace(Car c)
		
		Bmw b=new Bmw(0072, "Black", 2);
		b.speed();
		b.bmwFunction();
		System.out.println(b.getCarDetails());
		
		
		Ferrari f=new Ferrari(3404, "Red",4);
		f.speed();
		f.startNOS();
		startRace(f);//startRace(Car c)//upcasting
	}

}
