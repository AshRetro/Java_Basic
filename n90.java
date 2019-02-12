import java.util.*;
public class n90
{
public static void main(String rags[])
{
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter the size of the array-");
	int n=kb.nextInt();
	int a[][]=new int[n][n];	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=(int)(Math.random()*9)+1;
			System.out.print(a[i][j]+"  ");
		}
		System.out.println();
	}
	System.out.println();
	int s=0;
	while(s<(n/2))
	{
		for(int i=n-1-s;i>s;i--)
		{
			int t=a[n-1-s][i];
			a[n-1-s][i]=a[i][s];
			a[i][s]=t;
		}
		int m=n-1-s;
		for(int i=s;i<n-1-s;i++)
		{
			int t=a[s][i];
			a[s][i]=a[m][s];
			a[m][s]=t;
		m--;
		}
		for(int i=s;i<n-1-s;i++)
		{
			int t=a[s][i];
			a[s][i]=a[i][n-1-s];
			a[i][n-1-s]=t;
		}
		s++;
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			
			System.out.print(a[i][j]+"  ");
		}
		System.out.println();
	}
}
}