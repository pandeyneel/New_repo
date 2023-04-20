package simplejava;

public class Overriding 
{
	 void Vehicle()
	{
		System.out.println("this is Vehicle");
	}

}
 class bike extends Overriding
{
	 void Vehicle()
	{
		System.out.println("this is bike engine");
	}
}
class car extends Overriding
{
	 void Vehicle()
	{
		System.out.println("this is car's engine");
	}
}
 public class  examples
{
	public static void main(String[] args) 
	{
		car ob=new car();
		ob.Vehicle();
		
	}
}

