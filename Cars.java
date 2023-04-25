package Carabstract;

public abstract class Cars {
	private int modelno;
	private String color;
	public abstract void speed(); //must be implemented by child class

	public Cars()
	{   System.out.println("--default Car constr---");
		modelno=10;
		color="white";
	}
	public Cars(int modelno,String color)
	{   System.out.println("--para Car constr---");
		this.modelno=modelno;
		this.color=color;
	}
	
	//getter setter
	
	
	public Cars getCarDetails()
	{return this;
		
	}

	@Override
	public String toString() {
		return "Car [modelno=" + modelno + ", color=" + color + "]";
	}

	 
	
	
	
}


