/* CheckingAccount Client, version 2
   Anderson, Franceschi
*/

public class CheckingAccountClient2
{
   public static void main( String [] args )
   {
     // use default constructor
     CheckingAccount2 c1 = new CheckingAccount2( );
     System.out.println( "New checking account: " + c1 + "\n" );

     // use overloaded constructor
     CheckingAccount2 c2 = new CheckingAccount2( 100.00 );
     System.out.println( "New checking account: " + c2 );
   }
}
