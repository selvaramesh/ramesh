import java.io.*;
import java.util.*;

class vowels {
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
	     char b=a.next().charAt(0);
	   if (b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U')
	   {
	       System.out.println("VOWEL");
	   }
	   else
	   {
	       System.out.println("CONSONANT");
	   }
	}
}
