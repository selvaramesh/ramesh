import java.util.Arrays;
import javax.swing.JOptionPane;

	public class Five_Number_Summary

	{

	    public static void main(String args[])

	    {

       String E = JOptionPane.showInputDialog("How many integers do you want in your array?");

	        int a = Integer.parseInt(E);

	        int[] N = new int[a];

	        int i = 0;

	        for(i = 0; i < N.length; i++)

	        {

	            String F = JOptionPane.showInputDialog("Enter an integer");

	            int b = Integer.parseInt(F);

	            N[i] = b;

	        }

	 

	        Arrays.sort(N);

	 

	        int minimum = N[0];

	        double Q1 = (N.length / 4 + .5);

	        int median = (N.length / 2 + 1);

	        double Q3 = (N.length / 4 + 4.5);

	        int maximum =0;

	 

	        System.out.println("The minimum is" + " " + minimum);

	        System.out.println("The Q1 is" + " " + Q1);

	        System.out.println("The median is" + " " + median);

	        System.out.println("The Q3 is" + " " + Q3);

	    }

	}
