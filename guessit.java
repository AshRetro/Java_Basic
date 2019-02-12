import java.util.Scanner;
public class guessit
{
public static void main(String args[])
{
	Scanner kb=new Scanner(System.in);
	int n=1;
	
	
	int b =(int)(Math.random()*100)+1;
	for(;;)
	{ 
          for(long i=1;i<=10000000;i++)
		  {
			  long w=i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i*i;
		  }
		  
		System.out.print("enter the number which you think is same as the number in the game=");
	int a =kb.nextInt();
	   
		System.out.println("your attempts are="+n);
	if(a==b)
	{	System.out.println("YES YOU ARE RIGHT :)");
	    break;		
	}
    else if(a<b)
	{
		System.out.println("NUMBER INPUT IS LESS THAN EXPECTATION");
	}
    else if(a>b)
	{
		System.out.println("NUMBER INPUT IS MORE THAN EXPECTATION");
	}
	n++;
	}
}
}
