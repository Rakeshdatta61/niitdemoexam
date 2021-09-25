package question2;
import java.time.LocalDate;    
public class Account
     {
              int accountNumber;
              String accountHolderName;
              LocalDate openedDate;
              double balance;
              // provide all constructors , setters , getters and validation methods
            // always balance must not be less than 5000 Rs.
            Account()
            {
                
            }
            Account(int accountNumber,String accountHolderName,LocalDate openedDate,double balance)
            {
                this.accountNumber=accountNumber;
                this.accountHolderName=accountHolderName;
                this.openedDate=openedDate;
                this.balance=balance;
                validateBalance(balance);
                validateName(accountHolderName);
            }
            
            public void setAccountNumber(int accountNumber)
            {
                this.accountNumber=accountNumber;
            }
            public void setAccountHolderName(int setAccountHolderName)
            {
                this.accountHolderName=accountHolderName;
                validateName(accountHolderName);
                
            }
            public void setOpenedDate(LocalDate openedDate)
            {
                this.openedDate=openedDate;
            }
            public void setBalance(double balance)
            {
                this.balance=balance;
                validateBalance(balance);
            }
            
            public int getAccountNumber()
            {
                return accountNumber;
            }
            public String getAccountHolderName()
            {
                return accountHolderName;
            }
            public LocalDate getOpenedDate()
            {
                return openedDate;
            }
            public double getBalance()
            {
                return balance;
            }
            
            public void validateBalance(double balance)
            {
                if(balance<5000)
                {
                    System.out.println("balance must not be less than 5000rs");
                    System.exit(0);
                }
            }
            
            private void validateName(String accountHolderName)
        {
        int i=0;
        while (i<accountHolderName.length())
        {
            if(!(Character.isLetter(accountHolderName.charAt(i))))
            {
                if(!(Character.isWhitespace(accountHolderName.charAt(i))))
                {
                System.out.println("Enter Valid name.");
                System.exit(0);
                }
            }
            i++;
        }
    }
   }