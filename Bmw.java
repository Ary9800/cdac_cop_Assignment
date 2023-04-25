package Carabstract;

public class Bmw extends Cars {

	private int airBags;
	public Bmw()
	{
		System.out.println("BMW Default Constr");
		airBags=1;
	}
	public Bmw(int modelno,String color,int airBags)
	{
		//bydefault super()
		super(modelno,color);
		System.out.println("--para BMW constr----");
		this.airBags=airBags;
	}
	@Override
	public void speed() {
		System.out.println("BMW speed=280 km/hr ");
		
	}
	//specific behaviour given by BMW class
	public void bmwFunction()
	{
		System.out.println("BMW Specific method");
	}
	
	
	//to get BMW specific details override getCarDetailsMethod
	@Override
	public Bmw getCarDetails() {
		// TODO Auto-generated method stub
		return this;//
	}
	@Override
		public String toString() {
		return super.toString()+ "BMW [airBags=" + airBags + "]";
	}
	
	
	
	

	}

