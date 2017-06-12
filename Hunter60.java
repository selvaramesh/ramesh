import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];int c=0;
	    int b[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    for(int i=0;i<n;i++)
	    {
	        b[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(a[0]==b[i])
	        {
	            c=c+1;
	        }
	    }
	}
}
