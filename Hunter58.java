import java.io.*;
import java.util.*;
class Hunter58 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int d=sc.nextInt();
		int count=0;
		int l=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		       if((a[i]-a[j])==d||(a[i]-a[j])==-d)
		       {
		           count=count+1;
		       }
		       
		    }
		    
		}
		 System.out.println(count);
	}
}
