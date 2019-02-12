public class Patt03
{
	public static void main(String args[])
	{
		int m=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j++)
			{
				System.out.print(" ");
			}
			if(m!=0)
            for(int a=5;a>=m;a--)
            {
            	System.out.print(a);

            }
            m--;
            System.out.println();
		}
	}
}