package simplejava;

public class Overloading 
{
	public void same()
	{
		System.out.println("nothing to print");
	}
	public void same(char a)
	{
		System.out.println("charector name is:"+a);
	}
	public void same(String name)
	{
		char a=name.charAt(4);
		System.out.println("the output char is:"+a);
	}
	public void same(int d)
	{
		int sqr=d*d;
		System.out.println("the no should be shown:"+sqr);
	}
	public void same(double n)
	{
		double tringle=n*n*n;
		System.out.println("the area of triangle is:"+tringle);
	}
	public static void main(String[] args) {
		Overloading ob=new Overloading();
		ob.same();
		ob.same(5.6);
		ob.same("nileshkumarpandey");
		ob.same('h');
		
	}

}
