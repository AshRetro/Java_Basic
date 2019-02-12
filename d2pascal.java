import java.util.*;
public class d2pascal
{
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the power for the pascal triangle-");
		int n=kb.nextInt();
		int a[][]=new int[n+1][n+n+3];
		a[0][a[0].length/2]=1;

		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<a[0].length-1;j++)
			{
				if(a[i-1][j-1]!=0||a[i-1][j+1]!=0)
					a[i][j]=a[i-1][j-1]+a[i-1][j+1];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a[0].length-1;j++)
			{
				if(a[i][j]==0)
					System.out.print(" ");
				else
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}
}
