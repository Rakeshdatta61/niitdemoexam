package question1;

import java.util.Scanner;

public class TaxCalculator 
{
    private double monthlySalary;

    public TaxCalculator(double monthlySalary)
   {
		this.monthlySalary = monthlySalary;
   }
   public static double taxableAmount(double monthlySalary)
   {
    
    double taxAmount=0;
    double annualSalary=0;
	annualSalary=12*monthlySalary;
	if(annualSalary<250000)
    	return taxAmount;
	else

	{
		annualSalary = annualSalary - 250000;
		int taxPercent = 10;
		double amount = 250000;
		int i = 0;
		while (annualSalary > 0 && i < 2)
		{
			if (annualSalary > amount) 
			{
				annualSalary = annualSalary - amount;
				taxAmount = taxAmount + (amount * taxPercent / 100);
			} 
			else
			{
				taxAmount = taxAmount + (annualSalary * taxPercent / 100);
				annualSalary = 0;
				break;
			}
			amount = 500000;
			taxPercent = 20;
			i = i + 1;
		}
		if (annualSalary > 0)
			taxAmount = taxAmount + (annualSalary * 30 / 100);
		return taxAmount;

	  }
  }
}