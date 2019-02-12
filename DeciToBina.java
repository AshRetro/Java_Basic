import java.util.*;
public class DeciToBina
{
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Eneter a number to be converted into binary system-");
		int a=kb.nextInt();
		DeciToBina ob=new DeciToBina();
		System.out.println(ob.dToB(a));
	}
	String dToB(int a)
	{
		if(a==1)
			return (1+"");
		return (a%2+"")+dToB(a/2);
	}
}