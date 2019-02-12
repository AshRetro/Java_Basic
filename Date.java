import java.util.*;
public class Date
{
	public static void main(String args[])
	{
      Scanner kb=new Scanner(System.in);
      System.out.println("enter the time-");
      int dd=kb.nextInt();
      int mm=kb.nextInt();
      int yy=kb.nextInt();
       System.out.println("enter the time-");
      int dd2=kb.nextInt();
      int mm2=kb.nextInt();
      int yy2=kb.nextInt();
      Date ob=new Date();
      int[] arr={31,28,31,30,31,30,31,31,30,31,30,31}; 
      int sum=0,m=mm+1;
      while((mm+1)<=12)
      {
            if(m==2&&ob.isLeap(yy))
                  sum+=29;
            else
                  sum+=arr[m++];
      }
      m=1;
      while(m!=(mm2-1))
      {

            if(m==2&&ob.isLeap(yy))
                  sum+=29;
            else
                  sum+=arr[m++];      
      }
      int y=yy+1;
      while(y<yy2)
      {
            if(ob.isLeap(y))
                  sum+=366;
            else
                  sum+=365;
            y+=1;
      }
      sum+=(arr[mm-1]-dd)+(dd2-1);

      System.out.println(dd+" - "+mm+" - "+yy);
	}
	Boolean isLeap(int yy)
	{
		if((yy%400==0)||(yy%4==0||yy%100!=0))
			return true;
		else
			return false;
	}
}