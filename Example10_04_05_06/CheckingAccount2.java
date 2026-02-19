/* CheckingAccount class, version 2
   Anderson, Franceschi
*/

public class CheckingAccount2 extends BankAccount2
{
   /** default constructor
   *   explicitly calls the BankAccount default constructor
   */
   public CheckingAccount2( )
   {
       super( ); // optional, call BankAccount constructor
       System.out.println( "In CheckingAccount "
                            + "default constructor" );
   }

   /** overloaded constructor
   *   calls BankAccount overloaded constructor
   *   @param  balance  starting balance
   */
   public CheckingAccount2( double balance )
   {
       super( balance ); // call BankAccount constructor
       System.out.println( "In CheckingAccount "
                           + "overloaded constructor" );
   }
}
