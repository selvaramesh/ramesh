import java.io.*;
import java.util.*;
import java.lang.*;
class Ams {
	public static void main (String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int d=(int) Math.log10(n)+1;
	 int c=0;
	 int r=0;
	 int temp=n;
	 while(n>0)
	 {
	     r=n%10;
	     n=n/10;
	     c+=Math.pow(r,d);
	 }
	 if(c==temp)
	 {
	     System.out.println("amstrong number");
	 }
	 else{
	     System.out.println("not an amstrong number");
	 }
	}
}
