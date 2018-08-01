
public class static_and_nonstatic {
	
	String name; // this is non static variable ; Global variable
	static int number; // this is static variable; global variable
	
	
	public static void main(String[] args) {
		// static functions can only access static members

		number=10; //only static function can use static stuff
	}

	public static void sum() // this is static function
	{
		int n =100; //this is local variable
		
		//this function can use static stuff
	}
	
	public void sendmail()// this is non static function
	{
	 // there is no rule for non-static function
		number = 10; // it can use static stuff
	}
	
}
