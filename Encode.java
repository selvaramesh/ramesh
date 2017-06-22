import java.util.*;
public class Encode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int j=0,k=0;
		char ch1[]=new char[s1.length()];
		String s2=sc.next();
		char ch2[]=new char[s2.length()];
		for(int i=0;i<s1.length();i++)
		{
			int a=(Integer.valueOf(s1.charAt(i))+10);
			if(a>122)
			{
				a=a-122;
				a=96+a;
			}
		     ch1[j]=(char)a;
			j++;
		}
		String a=new String(ch1);
		System.out.println(a);
		System.out.print(s2.charAt(0));
		for(int i=1;i<s2.length()-1;i++)
		{	
			int b=(Integer.valueOf(s2.charAt(i))+10);
			if(b>122)
			{
				b=b-122;
				b=96+b;
			}
			System.out.print((char)b);
		}
		System.out.print(s2.charAt(s2.length()-1));
	}
}
