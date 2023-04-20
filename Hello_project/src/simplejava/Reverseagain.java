package simplejava;

public class Reverseagain 
{
	public void reverse(String name)
	{
	char[]c=name.toCharArray();
	for(int i=name.length()-2;i>=0;i--)
	{
		System.out.println(c[i]);
	}
	}
	public void apends()
	{
		String name="nilesh";
		StringBuilder cb=new StringBuilder(name);
	
		StringBuilder name2=cb.reverse();
		String naam=name2.toString();
		System.out.println(naam);
	}
	public static void main(String[] args) {
		Reverseagain ob=new Reverseagain();
		//ob.reverse("nilesh");
		ob.apends();
	}
}
