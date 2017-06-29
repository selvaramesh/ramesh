import java.io.*;
import java.util.*;
class RemoveDuplicate {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char ch[]=s.toCharArray();
	    HashSet<Character> hs=new HashSet<Character>();
	    for(int i=0;i<ch.length;i++)
	    {
	        hs.add(ch[i]);
	    }
	    for(char k:hs)
	    {
	        System.out.print(k);
	    }
	}
}
