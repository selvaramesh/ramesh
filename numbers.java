import java.io.*;
import java.util.*;

class numbers{
	public static void main(String[] args)
	{
		//code
		Scanner a=new Scanner(System.in);
	   int b=a.nextInt();
	   if (b==0)
	   {
	       System.out.println("the number is zero");
	   }
	   else if(b<0)
	   {
	       System.out.println("the number is negative");
	   }
	   else
	   {
	       System.out.println("the number is positive");
	   }
	}
}
