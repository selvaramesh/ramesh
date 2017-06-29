import java.io.*;
import java.util.*;
class DigitPalin {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
		int rem=0,sum=0;
		while(a>0)
		{
		   rem=a%10;
		   sum=sum+rem;
		   a=a/10;
		}
		String s=String.valueOf(sum);
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String b=new String(sb);
		if(Integer.valueOf(s)==Integer.valueOf(b))
		{
		    System.out.println("PALINDROME");
		}
		else{
		    System.out.println("Not an PALINDROME");
		}
	}
}
