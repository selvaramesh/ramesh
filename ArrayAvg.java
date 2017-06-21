public class ArrayAvg {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n/2+1];
        int c[]=new int[n/2];
        int temp1=0,temp2=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }     
        System.arraycopy(a, 0, b, 0, (n-(n/2)));
        System.arraycopy(a,(n/2+1),c,0,(n-(n/2+1)));
        for(int k:b)
        {
            System.out.println(k);
        }
        for(int j:c)
        {
            System.out.println(j);
        }
        for(int i=0;i<b.length;i++)
        {
            temp1=temp1+b[i];            
        }
        int avg1=temp1/b.length;
        for(int i=0;i<c.length;i++)
        {
            temp2=temp2+c[i];
        }
        int avg2=temp2/c.length;
        if(avg1==avg2)
        {
            System.out.print("[");
            for(int i=0;i<b.length;i++)
            {
                System.out.print(b[i]);
            }
            System.out.print("]");
            System.out.print("[");
            for(int i=0;i<c.length;i++)
            {
                System.out.print(c[i]);
            }
            System.out.print("]");
        }
        else
        {
            System.out.println("not possible");
        }
        
        
    }
    
}
