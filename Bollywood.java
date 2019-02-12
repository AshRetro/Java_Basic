import java.util.*;
public class Bollywood
{
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("ENTER A FILM NAME");
		String s=kb.nextLine();
		String s2=s;
		int k=0;
 		char aro[]=new char[s.length()];

        		 for(int i=0;i<28;i++)
          System.out.println();
		for(int a=0;a<s.length();a++)
		{
			char ch=s.charAt(a);
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' ')
		   {				   
                System.out.print(ch+" ");
				 aro[a]=s.charAt(a);			
            }
			else
			{
				System.out.print("_ ");
				 aro[a]='_';
		    }
        }     

        		 for(int i=0;i<2;i++)
                 System.out.println();
        int n=10;
        while(n!=0)
        {
        	if(true)
        	{
        		String test="";
        		for(int i=0;i<aro.length;i++)
        			test+=aro[i];
        		if(s.equalsIgnoreCase(test))
        			{k=1;break;}

        	}
        	System.out.println("number of turns left :"+"\t"+n+"\t");
        	System.out.println("enter the alphabet or full name  -(eg--h)");   
            String s1=kb.nextLine(); 
            if(s.equalsIgnoreCase(s1)) 
            {
                k=1;break;
            }   	
        	char ch=s1.charAt(0);        
        	int y=0;
        	if(true)
        	{ 
                for(int i=0;i<aro.length;i++)
                if(s.charAt(i)==ch)
                {
        		aro[i]=ch;y++;
                }
        		for(int i=0;i<aro.length;i++)
        			System.out.print(aro[i]+" ");
        		
        	}
        	
        if(y==0)
        {
        	n--;
        	
        }
        for(int i=0;i<2;i++)
          System.out.println();
        }
        if(k==1)
        	System.out.println("YOU WON!!!!!!");
        else
        	System.out.println("YOU LOSE!!!!!!");
}
}