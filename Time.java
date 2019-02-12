import java.util.*;
public class Time
{
	int hr,min,sec;
	void addSec(int x)
	{
		sec+=x;
	}
	void setTime(int hr,int min,int sec)
	{
		this.hr=hr;this.min=min;this.sec=sec;
	}
	void showTime()
	{
		System.out.println(hr+" : "+min+" : "+sec);
	}
	int toSec()
	{
		return hr*3600+min*60+sec;
	}
	void validate()
	{
		min+=(sec/60);
		sec%=60;
		hr+=(min/60);
		min%=60;
	}
	int diff(Time T)
	{
		return Math.abs(this.toSec()-T.toSec());
	}
    public static void main(String rag[])
    {
    	Scanner kb=new Scanner(System.in);
    	System.out.println("Enter the time in hr:min:sec-");
    	Time t1=new Time();
    	int a=kb.nextInt();
    	int b=kb.nextInt();
    	int c=kb.nextInt();
    	t1.setTime(a,b,c);
    	t1.validate();
    	System.out.println("Enter the time in hr:min:sec-");
    	Time t2=new Time();
    	int d=kb.nextInt();
    	int e=kb.nextInt();
    	int f=kb.nextInt();
    	t2.setTime(d,e,f);
    	t2.validate();
    	t1.showTime();
    	t2.showTime();
    	System.out.println("Enter seconds to add-");
    	int msec=kb.nextInt();
    	t1.addSec(msec);
    	t1.validate();
    	Time t3=new Time();
    	t3.setTime(0,0,t1.diff(t2));
    	t3.validate();
    	System.out.println("The difference between givem time and previous one is-");
    	t3.showTime();
    }
}