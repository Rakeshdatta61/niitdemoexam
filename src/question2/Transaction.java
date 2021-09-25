package question2;
class Transaction
{
        public static double deposit(Account account , double amount)
        {
                 //Must add amount to account object balance and return updated balance.
                 account.setBalance(account.getBalance()+amount);
                 return account.getBalance();
        }
        public   static double withdraw(Account account ,  double amount) throws InsufficientBalanceException
       {
          //if account object balance – amount is less than 5000 then Exception should be thrown.
          if((account.getBalance()-amount)<5000)
          {
              throw new InsufficientBalanceException("Account balance is insufficient");
              
          }
          
          account.setBalance(account.getBalance()-amount);
          
          return account.getBalance();
       }
}