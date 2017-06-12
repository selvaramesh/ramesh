import java.io.*;
import java.util.*;
class typecast {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		int a=Integer.parseInt(s);
		int b=Integer.parseInt(t);
		int c=a*b;
		String u=String.valueOf(c);
		System.out.println(u);
	}
}
