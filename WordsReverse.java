import java.util.*;
public class WordsReverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split(" ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
    
}
