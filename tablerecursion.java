public class tablerecursion 
{
    public static void main(String[] args) 
    {
        int a[][]=new int[2][2];
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=(int)(Math.random()*10)+1;
                System.out.print(a[i][j]+" ");
                sum+=a[i][j];
            }
            System.out.println();
        }
        Rsum2darr ob=new Rsum2darr();
        System.out.println();
        System.out.println(ob.darray(a,a.length-1,a[0].length-1));
        System.out.println(sum+" ");
    }

    static int rec(int[][] table, int n, int m) 
    {
        if (m == 0)
            return table[n][0];
        if (n == 0)
            return table[0][m];
        System.out.println("n:" + n + "  m:" + m);

        return rec(table, n - 1, m) + rec(table, n, m - 1);
    }
}