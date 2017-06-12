import java.io.*;
import java.util.*;

class Hunter56 {
	public static void main (String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        int b[]=new int[256];
	        int l=0;
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        int c=0;
	        for(int i=0;i<n;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                c=a[i]+a[j];
	               if(c>=-5&&c<=5)
	               {
	               System.out.print(a[i]);
	               System.out.println(a[j]);
	               break;
	               }
                    	               
	            }
	        }
	}
}
