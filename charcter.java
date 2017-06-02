import java.io.*;
import java.util.*;

class charcter {
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
	     char b=a.next().charAt(0);
	   if (b>65)
	   {
	       System.out.println("given character is an alphabet");
	   }
	   else
	   {
	       System.out.println("given character is not an alphabet");
	   }
	}
}
