package simplejava;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmapp 
{
	public void getno(String name)
	{
		HashMap<Character, Integer> hasm=new HashMap<>();
		for(int i=name.length()-1;i>=0;i--)
		{
			if(hasm.containsKey(name.charAt(i)))
			{
				int count=hasm.get(name.charAt(i));
				hasm.put(name.charAt(i), ++count);
			}
			else {
				hasm.put(name.charAt(i), 1);
			}
		}
		
		System.out.println(hasm);
	}
	public static void main(String[] args) {
		Hashmapp ob=new Hashmapp();
		System.out.println("pleas enter the input");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		ob.getno(name);
	}

}
