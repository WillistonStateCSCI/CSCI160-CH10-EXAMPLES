/**   BankAccount class, version 1
*     Anderson, Franceschi
*     Represents a generic bank account
*/
import java.text.DecimalFormat;

public class BankAccount4
{
  public final DecimalFormat MONEY
                  = new DecimalFormat( "$#,##0.00" );
  private double balance;

  /** default constructor
  *   sets balance to 0.0
  */
  public BankAccount4( )
  {
    balance = 0.0;
  }

  /** overloaded constructor
  *   @param balance  beginning balance
  */
  public BankAccount4( double balance )
  {
    deposit( balance );
  }

  /** accessor for balance
  *   @return  current account balance
  */
  public double getBalance( )
  {
    return balance;
  }

  /** deposit amount to account
  *   @param amount  amount to deposit;
  *                  amount must be >= 0.0
  *   @return  a reference to this object
  */
  public BankAccount4 deposit( double amount )
  {
    if ( amount >= 0.0 )
      balance += amount;
      
    return this;
  }

  /** withdraw amount from account
  *    @param amount   amount to withdraw;
  *                    amount must be >= 0.0
  *                    amount must be <= balance
  *    @return a reference to this object
  */
  public BankAccount4 withdraw( double amount )
  {
    if ( amount >= 0.0 && amount <= balance )
      balance -= amount;
     
    return this;
  }

  /** toString
  *  @return  the balance formatted as money
  */
  @Override
  public String toString( )
  {
    return "balance is " + MONEY.format( balance );
  }
}
