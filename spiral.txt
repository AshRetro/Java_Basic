import java.util.*;
public class spiral
{
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the length of the array-");
		int n=kb.nextInt();
		int a[][]=new int[n][n];	    
	    int s=0;
	    int c=n*n;
	    while(s<(n/2))
	    {
	    	for(int i=s;i<n-1-s;i++)
	    		a[s][i]=c--;
	    	for(int i=s;i<n-1-s;i++)
	    		a[i][n-1-s]=c--;
	    	for(int i=n-1-s;i>s;i--)
	    		a[n-1-s][i]=c--;
	    	for(int i=n-1-s;i>s;i--)
	    		a[i][s]=c--;
	    	s++;
	    }
	    if(n/2!=0)
	    {
	    	a[n/2][n/2]=1;
	    }
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0;j<a[i].length;j++)
	    	{	    		
	    	System.out.print(a[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	}
}