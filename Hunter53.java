import java.io.*;
import java.util.*;

class Hunter53 {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int d=sc.nextInt();
	    int n=s.length();
	    char ch[]=s.toCharArray();
	    for(int i=0;i<d-1;i++)
	    {
	        for(int j=i+1;j<n;j++)
	       { 
	       System.out.print(ch[i]);
	       System.out.println(ch[j]);
	        
	    }
	    }
	}
}
