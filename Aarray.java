import java.io.*;
import java.util.*;
class Aarray {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int k=sc.nextInt();
		int b[]=new int[a];
		int c[]=new int[a];
		int l=0;
		for(int i=0;i<a;i++)
		{
		    b[i]=sc.nextInt();
		}
		for(int j=k+1;j<a;j++)
		{
		    c[l]=b[j];
		    l++;
		}
		for(int j=0;j<=k;j++)
		{
		    c[l]=b[j];
		    l++;
		}
		for(int i=0;i<a;i++)
		{
		    System.out.println(c[i]);
		}
	}
}
