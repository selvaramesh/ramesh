import java.io.*;
import java.util.*;
class AddEvenStr {
	public static void main (String[] args) {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   char c[]=s.toCharArray();
	   char temp;
	   for(int i=0,j=i+1;i<c.length&&j<c.length;i=i+2,j=j+2)
	   {
	       temp=c[i];
	       c[i]=c[j];
	       c[j]=temp;
	       
	   }
	   for(int i=0;i<c.length;i++)
	   {
	       System.out.print(c[i]);
	   }
	}
}
