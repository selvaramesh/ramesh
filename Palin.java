import java.io.*;
import java.util.*;
import java.lang.*;
class Palin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int x=0;
        int sum=0;
        int temp=n;
        while(n>0)
        {
            x=x%10;
            sum=(sum*10)+x;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}
	    
	    
	
