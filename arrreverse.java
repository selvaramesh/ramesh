import java.io.*;
import java.util.*;

class arrreverse{
	public static void main (String[] args) {
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int a[]=new int[n];
	     int d=sc.nextInt();
	     int b[]=new int[n];
	     int l=0;
	     for(int i=0;i<n;i++)
	     {
	         a[i]=sc.nextInt();
	     }
	     for(int j=d;j<n;j++)
	     {
	         b[l]=a[j];
	         l++;
	     }
	     for(int j=0;j<d;j++)
	     {
	         b[l]=a[j];
	         l++;
	     }
	     for(int i=0;i<n;i++)
	     {
	         System.out.print(b[i]);
	     }
	     
	}
}
