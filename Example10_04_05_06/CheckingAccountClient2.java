/* CheckingAccount Client, version 2
   Anderson, Franceschi
*/

public class CheckingAccountClient2
{
   public static void main( String [] args )
   {
     // use default constructor
     CheckingAccount3 c1 = new CheckingAccount3( );
     System.out.println( "New checking account: " + c1 + "\n" );

     // use overloaded constructor
     CheckingAccount3 c2 = new CheckingAccount3( 100.00 );
     System.out.println( "New checking account: " + c2 );
   }
}
