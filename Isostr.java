import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   char c[]=s.toCharArray();
	   String t=sc.nextLine();
	   char d[]=t.toCharArray();
	   int a=0,b=0,e=0,f=0;
	   if(c.length==d.length)
	   {
	       for(int i=0,j=i+1;i<c.length&&j<c.length;i++,j++)
	       {
	           if(c[i]==c[j])
	           {
	               a=i;
	               b=j;
	           }
	       }
	       for(int i=0,j=i+1;i<d.length&&j<d.length;i++,j++)
	       {
	           if(d[i]==d[j])
	           {
	               e=i;
	               f=j;
	           }
	       }
	   }
	   else
	   {
	       System.out.println("enter the correct input");
	   }
	   if(a==e&&b==f)
	   {
	       System.out.println("true");
	   }
	   else
	   {
	       System.out.println("false");
	   }
	}
}
