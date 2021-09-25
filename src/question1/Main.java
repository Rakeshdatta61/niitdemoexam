package question1;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter Monthly Salary");
       double monthlySalary=sc.nextDouble();
       TaxCalculator tc=new TaxCalculator(monthlySalary);
       System.out.println(tc.taxableAmount(monthlySalary));
     }

}