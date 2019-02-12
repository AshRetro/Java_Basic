import java.io.*;
public class tfort
{
	public static void main(String args[])throws IOException
	{
	InputStreamReader kb1=new InputStreamReader(System.in);
	BufferedReader kb=new BufferedReader(kb1);
	char a[][]=new char[3][3];
	
	for(int i=0;i<a.length;i++)
	{
	for(int j=0;j<a[i].length;j++)
	{
	a[i][j]=(char)(32);
	if(j==0||j==1)
	System.out.print(a[i][j]+" | ");
else
	System.out.print(a[i][j]);
	}
	System.out.println();
	}
	int k=0,chance=1;
	while(true)
	{
		int t=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
              if(a[i][j]=='x'||a[i][j]=='o')
              	t++;
			}
		}
		if(t==9)
		{k=1;break;}
	char ch;
	if(chance%2==0)
    {
    	System.out.println("\"o\" 's turn-");
    	System.out.println("Enter its position in co-ordinates-"); 
    System.out.print("its ROW-");      
    int x=Integer.parseInt(kb.readLine().substring(0))-1;     
    System.out.print("its COLUMN-"); 
    int y=Integer.parseInt(kb.readLine().substring(0))-1;
    if(x>3||y>3)
    	continue;
    if(a[x][y]=='x'||a[x][y]=='o')
    {
    	System.out.println("Wrong co-ordinates.");continue;
    }
     else
    a[x][y]='o';
    }
    else
    {
    	System.out.println("\"x\" 's turn-"); 
    	System.out.println("Enter its position in co-ordinates-"); 
    System.out.print("its ROW-");      
    int x=Integer.parseInt(kb.readLine().substring(0))-1;    
    System.out.print("its COLUMN-"); 
    int y=Integer.parseInt(kb.readLine().substring(0))-1;
    if(x>3||y>3)
    	continue;
    if(a[x][y]=='x'||a[x][y]=='o')
    {
    	System.out.println("Wrong co-ordinates.");continue;
    }
     else
    	a[x][y]='x';
    
    }     
		
	
    


    for(int i=0;i<a.length;i++)
	{
	for(int j=0;j<a[i].length;j++)
	{	
	if(j==0||j==1)
	System.out.print(a[i][j]+" | ");
else
	System.out.print(a[i][j]);
	}
	System.out.println();
	}
	


    if(a[0][1]=='x'&&a[0][0]=='x'&&a[0][2]=='x')
    {System.out.println("\"x\" wins!!");break;}
     if(a[1][1]=='x'&&a[1][0]=='x'&&a[1][2]=='x')
    {System.out.println("\"x\" wins!!");break;}
     if(a[2][1]=='x'&&a[2][0]=='x'&&a[2][2]=='x')
    {System.out.println("\"x\" wins!!");break;}
     if(a[0][0]=='x'&&a[1][0]=='x'&&a[2][0]=='x')
    {System.out.println("\"x\" wins!!");break;}
     if(a[0][1]=='x'&&a[1][1]=='x'&&a[2][1]=='x')
    {System.out.println("\"x\" wins!!");break;}
     if(a[0][2]=='x'&&a[1][2]=='x'&&a[2][2]=='x')
    {System.out.println("\"x\" wins!!");break;}
 if(a[0][0]=='x'&&a[1][1]=='x'&&a[2][2]=='x')
    {System.out.println("\"x\" wins!!");break;}
 if(a[0][2]=='x'&&a[1][1]=='x'&&a[2][0]=='x')
    {System.out.println("\"x\" wins!!");break;}


 if(a[0][1]=='o'&&a[0][0]=='o'&&a[0][2]=='o')
    {System.out.println("\"o\" wins!!");break;}
     if(a[1][1]=='o'&&a[1][0]=='o'&&a[1][2]=='o')
    {System.out.println("\"o\" wins!!");break;}
     if(a[2][1]=='o'&&a[2][0]=='o'&&a[2][2]=='o')
    {System.out.println("\"o\" wins!!");break;}
     if(a[0][0]=='o'&&a[1][0]=='o'&&a[2][0]=='o')
    {System.out.println("\"o\" wins!!");break;}
     if(a[0][1]=='o'&&a[1][1]=='o'&&a[2][1]=='o')
    {System.out.println("\"o\" wins!!");break;}
     if(a[0][2]=='o'&&a[1][2]=='o'&&a[2][2]=='o')
    {System.out.println("\"o\" wins!!");break;}
 if(a[0][0]=='o'&&a[1][1]=='o'&&a[2][2]=='o')
    {System.out.println("\"o\" wins!!");break;}
 if(a[0][2]=='o'&&a[1][1]=='o'&&a[2][0]=='o')
    {System.out.println("\"o\" wins!!");break;}
chance++;
for(int i=0;i<2;i++)
	System.out.println();
}
if(k==1)
System.out.println("!!No one wins!!");

	} 
}