
public class car {

	String mod;
	int price;
	static int wheels;
	
	public car(String m, int p)
	{
		mod = m;
		price = p;
		
		System.out.println(" ");
	}
	
	public car()
	{
		System.out.println("Car constructor no arg");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c1 = new car();
		c1.mod = "Merc";
		c1.price= 45124;
		car.wheels=4;
		c1.start();
		c1.acc();
		
		car c2=new car();
		c2.mod = "bmw";
		c2.price=45612;
		car.wheels=4;
		c2.start();
		c2.acc();

	}

	
	public void start(){
		
		System.out.println(mod +" starting");
		
	}
	
	public void acc()
	{
		
		System.out.println(mod +" accelarating");
	}
	
	
	
}



