import java.util.*;
public class square
{
public static void main(String args[])
{
	Scanner kb =new Scanner(System.in);
	System.out.println("Enter the edge of the square-");
	int n=kb.nextInt();
for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=0&&i!=n)
				{
					if(j!=0&&j!=n)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}