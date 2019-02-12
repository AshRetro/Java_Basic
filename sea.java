public class sea
{
	public static void main(String args[])
	{
	int a[][]=new int[5][7];
	for(int i=0;i<a.length;i++)
	{
	for(int j=0;j<a[i].length;j++)
	{
     a[i][j]=(int)(Math.random()*100)+1;
     System.out.print(a[i][j]+" ");
	}
	System.out.println();
	}
	System.out.println();
	for(int i=0;i<a.length;i++)
	{
	for(int j=0;j<a[i].length;j++)
	{
	for(int k=0;k<a.length;k++)
	{
	for(int m=0;m<a[k].length;m++)
	{
	if(a[i][j]<a[k][m])
	{
	int h=a[i][j];
	a[i][j]=a[k][m];
	a[k][m]=h;
	}
	}
	}
	}
	}
	for(int i=0;i<a.length;i++)
	{
	for(int j=0;j<a[i].length;j++)
	{    
     System.out.print(a[i][j]+" ");
	}
	System.out.println();
	}
	}
}