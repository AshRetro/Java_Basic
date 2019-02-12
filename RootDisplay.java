	import java.util.*;
	public class RootDisplay
	{
	public static void main(String args[])
	{
      Scanner kb=new Scanner(System.in);
      System.out.println("enter a no.-");
      int a=kb.nextInt();
      int two=2,sum=0;
      while(a!=1)
      {
      	if(a%two==0)
      	{
      		sum=sum*10+two;
      		a/=two;
      	}
      	else
      		two+=1;
      }
     int ur=1,dis=1;
     while(sum!=0)
     {
      	if(sum%10==(sum%100)/10)
      	{
      		dis*=(sum%10);
      		sum/=100;
      	}
      	else
      	{
      		ur*=(sum%10);
      		sum/=10;;
      	}
      }
      System.out.println(dis+" ("+ur+" ^1/2)");
	}
	}