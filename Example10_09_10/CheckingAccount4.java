 /* CheckingAccount class, version 4
    Anderson, Franceschi
 */

 public class CheckingAccount4 extends BankAccount2
 {
    public final double DEFAULT_FEE = 5.00;
    private double monthlyFee;

    /** default constructor
    *   explicitly calls the BankAccount default constructor
    *   sets monthlyFee to default value
    */
    public CheckingAccount4( )
    {
        super( ); // call BankAccount constructor
        monthlyFee = DEFAULT_FEE;
    }

    /** overloaded constructor
    *  calls BankAccount overloaded constructor
    *  @param  balance  starting balance
    *  @param  monthlyFee starting monthly fee
    */
    public CheckingAccount4( double balance,
                            double monthlyFee )
    {
       super( balance ); // call BankAccount constructor
       setMonthlyFee( monthlyFee );
    }

    /** applyMonthlyFee method
    * charges the monthly fee to the account
    * @return a reference to this object
    */
    public CheckingAccount2 applyMonthlyFee( )
    {
      withdraw( monthlyFee );
      return this;
    }

    /** accessor method for monthlyFee
    *  @return  monthlyFee
    */
    public double getMonthlyFee( )
    {
      return monthlyFee;
    }

    /** mutator method for monthlyFee
    *  @param monthlyFee new value for monthlyFee
    *  @return a reference to this object
    */
    public CheckingAccount2 setMonthlyFee( double monthlyFee )
    {
      if ( monthlyFee >= 0.0 )
         this.monthlyFee = monthlyFee;
      
      return this;
    }

    /* toString method
    *  @return String containing formatted balance and monthlyFee
    *    invokes superclass toString to format balance
    */
    @Override
    public String toString( )
    {
      return super.toString( )
             + "; monthly fee is " + MONEY.format( monthlyFee );
    }
 }
