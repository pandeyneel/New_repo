package simplejava;

import java.util.HashMap;
import java.util.Scanner;

public class Occcurance 
{
	public void getno(String name)
	{
		HashMap<Character, Integer> hmap=new HashMap<>();
		for(int i=name.length()-1;i>=0;i--)
		{
			if(hmap.containsKey(name.charAt(i)))
			{
				int count=hmap.get(name.charAt(i));
				hmap.put(name.charAt(i), ++count);
			}
			else {
				hmap.put(name.charAt(i), 1);
			}
		}
		System.out.println(hmap);
	}
	
	public static void main(String[] args) {
		Occcurance ob=new Occcurance();
		System.out.println("put the name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		ob.getno(name);
	}

}
