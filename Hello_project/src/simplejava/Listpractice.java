package simplejava;

public class Listpractice 
{
	public void square()
	{
		System.out.println("nothing to print");
	}
	public void square(int no)
	{
		int sqr=no*no;
		System.out.println("the int sqr is:"+sqr);
	}
	public void square(long no)
	{
		long sqr=no*no;
		System.out.println("the long sqr is:"+sqr);
	}
	public void square(float no)
	{
		float sqr=no*no;
		System.out.println("the float sqr is:"+sqr);
	}
public void square(double no)
{
	double sqr=no*no;
	System.out.println("the double sqr is:"+sqr);
}
	public static void main(String[] args) {
		Listpractice ob=new Listpractice();
		ob.square();
		ob.square(5);
		ob.square(2.5);
		ob.square(2.23);
		
		
	}

}
