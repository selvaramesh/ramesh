import java.util.*;
public class Hunter60 {
	public static void main (String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int n=sc.nextInt();
            int m=sc.nextInt();
	    int a[]=new int[n];
	    int b[]=new int[m];
            int flag=0;
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    for(int i=0;i<m;i++)
	    {
	        b[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(a[0]==b[i])
	        {
	            flag=i;
	        }
            }
            System.out.println(flag-1);
	}
}
