
public class testcar {

	public static void main(String[] args) {
		
		
		
		car a = new car();
		car b = new car();
		car c = new car ();
		
		a.mod="A";
		b.mod="B";
		c.mod= "C";
		
			
		
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		
		
		// object reference
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		
		

	}

}
