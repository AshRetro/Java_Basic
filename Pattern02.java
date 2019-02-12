public class Pattern02
{
	public static void main(String args[])
	{
		String s="35791";
		int n=0;
		String w="";
		while(n!=s.length())
		{			
			w=w+s.substring(n);
			w=w+s.substring(0,n);
			System.out.print(w);
			w="";
			n++;
			System.out.println();
		}
	}
}