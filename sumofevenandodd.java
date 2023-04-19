import java.util.Scanner;
public class sumofevenandodd {

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		int res=0, res2=0, i;
		for(i=1; i<=n; i++)
		
		{
			if(i%2==0)
			{
				res=res+i;
			}
			else 
			{
				res2=res2+i;
			}
		}
		System.out.println("sum of even series="+res);
		System.out.println("sum of odd series="+res2);
		// TODO Auto-generated method stub

	}

}
