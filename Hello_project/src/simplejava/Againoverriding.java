package simplejava;

  class Againoverriding 
{
	void nilesh()
	{
		System.out.println("I have one gf");
	}

}
class shraddha extends Againoverriding 
{
	void nilesh()
	{
		System.out.println("i'm neel's gf");
	}
}
class aka extends Againoverriding
{
	void nilesh()
	{
		System.out.println("i'm his ex");
	}
}
public class anker
{
	public static void main(String[] args) {
		aka ob=new aka();
		ob.nilesh();
	}
}
