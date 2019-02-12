import java.util.*;
public class PowerCount
{
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a number-");
		int a=kb.nextInt();
		PowerCount ob=new PowerCount();
		System.out.println(ob.powCount(a,2));		
	}
	int powCount(int a,int two)
	{
		if(a%two==0)
		{
			if(a/two==1)
				return 1;
			return 1+powCount(a/two,two);
		}
		else
			return powCount(a,two+1);
	}
	
}