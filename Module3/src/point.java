
public class point {
	
	int x;
	int y;
	

	public static void main(String[] args) {

		point p = new point ();
		p.x=10;
		p.y=20;
		
		swap(p.x,p.y);
		
		System.out.println(p.x + " swap value" + p.y ); // it will not swap because a and b
		                                                //are not swapped
		
		// to swap we have to create a function and create another object reference pointing
		//same object as p
		
		swapvals(p);
		
		System.out.println(p.x + " swap value" + p.y );
		
		
	}

	
	public static void swap(int a, int b){
		
		int temp = a;
		a=b;
		b=temp;
			
		
	}
	
	
	public static void swapvals(point t)

	{
		int temp = t.x;
		t.x= t.y;
		t.y = temp;
		
	}
}
