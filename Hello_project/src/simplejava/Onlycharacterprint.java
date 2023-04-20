package simplejava;

import java.util.Scanner;

public class Onlycharacterprint 
{
	public void getstring(String name)
	{
		StringBuilder name1=new StringBuilder();
		char[]c=name.toCharArray();
		for(int i=0;i<name.length()-1;i++)
		{
			if(Character.isDigit(c[i]))
			{
				name1.append(c[i]);
			}
		}
		System.out.println(name1);
		
	}
	public static void main(String[] args) {
		Onlycharacterprint ob=new Onlycharacterprint();
		System.out.println("name please");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		ob.getstring(name);
	}

}
