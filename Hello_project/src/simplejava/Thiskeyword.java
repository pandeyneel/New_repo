package simplejava;

public class Thiskeyword 
{
	public void scaler()
	{
		System.out.println("my name is scaler");
		
	}
	public void name()
	{
		this.scaler();
		System.out.println("my name is name");
		
	}
	public static void main(String[] args) {
		Thiskeyword ob=new Thiskeyword();
		ob.name();
	}

}
